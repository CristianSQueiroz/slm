/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import ClassesDeConexao.RelatorioDB;
import Util.Utilidades;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;
import view.MainFrameSLM;

/**
 *
 * @author csqueiroz
 */
public class GerarRelatorio {

    private File file;
    private Document d;
    private PdfWriter pdfWriter;
    private final Relatorio relatorio;
    private ArrayList<Paragraph> paragrafos;
    private Font tableHeader;
    private Font tableContent;
    private float[] columnswidth;
    private String[] columnName;
    private final String orderBy;
    private final HashMap restricoes;
    PdfPTable pdfPTable;
    private int indiceAtualDaColuna = 0;

    public GerarRelatorio(Relatorio relatorio, HashMap restricoes, String orderBy) {
        this.relatorio = relatorio;
        this.restricoes = restricoes;
        this.orderBy = orderBy;
        init();
    }

    public void init() {
        /*JFileChooser chooser = new JFileChooser();
         chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
         if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
         System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
         System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
         } else {
         System.out.println("No Selection ");
         }
                
         String saida = "\\RelatorioDiarioExecucao.pdf";

         System.out.println(chooser.getSelectedFile() + saida);
         file = new File(chooser.getSelectedFile() + saida);*/

        file = new File("C:\\Windows\\Temp\\" + relatorio.getNmRelatorio() + ".pdf");
        file.delete();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    if (file.exists()) {
                        file = new File("C:\\Windows\\Temp\\" + relatorio.getNmRelatorio() + "2.pdf");
                    }
                    if (relatorio.getOrientacao().equalsIgnoreCase("Retrato")) {
                        d = new Document(PageSize.A4);
                    } else {
                        d = new Document(PageSize.A4.rotate());
                    }

                    paragrafos = new ArrayList<>();
                    tableHeader = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
                    tableContent = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL, BaseColor.BLACK);

                    dateHeader();
                    preencheVariaveis();
                    preencheNomeColuna();
                    preenche();
                    printPdf();
                } catch (Exception e) {

                }
            }
        });

    }

    private void preencheNomeColuna() {
        toParagraphs("\n", Element.ALIGN_LEFT);
        toParagraphs("\n", Element.ALIGN_LEFT);
        for (int x = 0; x < columnName.length; x++) {
            insertCell(pdfPTable, columnName[x], Element.ALIGN_LEFT, 1, tableHeader);
        }
    }

    public void preenche() throws ParseException {
        MainFrameSLM.getInstance().getStatusBar().setProcesso("Realizando a consulta");
        ArrayList<HashMap> registros = new RelatorioDB().getRegistros(relatorio.getSelect(), restricoes, orderBy);
        int contadorDePreenchimento = 0;
        MainFrameSLM.getInstance().getStatusBar().setProcesso("Montando o relatório");
        for (int x = 0; x < registros.size(); x++) {
            registros.get(x).entrySet().toArray();
            while (contadorDePreenchimento < columnswidth.length) {
                for (Object registro : registros.get(x).entrySet().toArray()) {
                    String temp = registro.toString();
                    int separador = temp.indexOf("=");
                    String temp2 = temp.substring(0, separador);
                    String temp3 = temp.substring(separador + 1, temp.length());
                    if (getNmAtributo(temp2).equalsIgnoreCase(columnName[contadorDePreenchimento])) {
                        if (temp.contains("DT")) {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            insertCell(pdfPTable, sdf.format(new Date(Timestamp.valueOf(temp3).getTime())), Element.ALIGN_LEFT, 1, tableContent);
                        } else {
                            insertCell(pdfPTable, temp3.equalsIgnoreCase("null") ? "" : temp3, Element.ALIGN_LEFT, 1, tableContent);
                        }
                        contadorDePreenchimento++;
                    }
                    if (contadorDePreenchimento >= columnswidth.length) {
                        break;
                    }
                }
            }
            contadorDePreenchimento = 0;
        }

        /*for (OrdemDeServico os : ordens) {
         String ordem = null;
         JFormattedTextField jft = new JFormattedTextField();
         MaskFormatter maskFormatter = new MaskFormatter(new Utilidades().mascaraOrdem(os.getNumeroOrdem()));
         maskFormatter.install(jft);
         jft.setText(String.valueOf(os.getNumeroOrdem()));
         ordem = jft.getText();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         insertCell(pdfPTable, ordem, Element.ALIGN_LEFT, 1, tableContent);
         insertCell(pdfPTable, sdf.format(os.getDataEmissao()), Element.ALIGN_LEFT, 1, tableContent);
         insertCell(pdfPTable, os.getServicosAExecutar(), Element.ALIGN_LEFT, 1, tableContent);
         double valor = 0;
         for (MaoDeObra mao : os.getMaoDeObra()) {
         valor += mao.getQtd();
         }
         String Metragem = String.valueOf(valor);
         Metragem = Metragem.replace(".", ",");
         insertCell(pdfPTable, Metragem, Element.ALIGN_LEFT, 1, tableContent);
         for (Equipe equipe : equipes) {
         if (equipe.getId() == os.getEquipe()) {
         insertCell(pdfPTable, equipe.getNomeEquipe(), Element.ALIGN_LEFT, 1, tableContent);
         break;
         }
         }
         insertCell(pdfPTable, os.getObs(), Element.ALIGN_LEFT, 1, tableContent);

         }*/
        Paragraph p = new Paragraph();
        pdfPTable.setWidthPercentage(100);
        p.add(pdfPTable);
        paragrafos.add(p);
    }

    private void preencheVariaveis() {
        ArrayList<HashMap> listaRelatorio = relatorio.getAtributosAsList();
        int qtColunas = listaRelatorio.size();
        columnswidth = new float[qtColunas];
        for (int x = 0; x < qtColunas; x++) {
            columnswidth[x] = Utilidades.validaFloat(listaRelatorio.get(x).get("SIZE")) / 100;
        }
        columnName = new String[qtColunas];
        for (int x = 0; x < qtColunas; x++) {
            columnName[x] = getNmColuna(Utilidades.validaString(listaRelatorio.get(x).get("ATRIBUTO")));
        }
        pdfPTable = new PdfPTable(columnswidth);
    }

    public void toParagraphs(String linha, int alinhamento) {
        Paragraph p = new Paragraph();
        p.add(linha);
        p.setAlignment(alinhamento);
        paragrafos.add(p);
    }

    public void toParagraphs(String linha, int alinhamento, Font font) {
        Paragraph p = new Paragraph(linha, font);
        p.setAlignment(alinhamento);

        paragrafos.add(p);
    }

    public void dateHeader() {
        Font fonte = new Font(FontFamily.TIMES_ROMAN, 10);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        toParagraphs(sdf.format(new Date(System.currentTimeMillis())), Element.ALIGN_RIGHT, fonte);
        toParagraphs("\n", Element.ALIGN_LEFT);
        fonte = new Font(FontFamily.TIMES_ROMAN, 15, Font.BOLD);
        toParagraphs("Santos Engenharia", Element.ALIGN_LEFT, fonte);
        toParagraphs("\n", Element.ALIGN_CENTER);
        fonte = new Font(FontFamily.TIMES_ROMAN, 15);
        toParagraphs(relatorio.getNmRelatorio(), Element.ALIGN_CENTER, fonte);
        toParagraphs("\n", Element.ALIGN_CENTER);
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        toParagraphs("Data: " + (sdf.format(new Date(System.currentTimeMillis()))), Element.ALIGN_LEFT);

    }

    public void printPdf() {
        try {
            pdfWriter = PdfWriter.getInstance(d, new FileOutputStream(file));
            d.open();
            for (int i = 0; i < paragrafos.size(); i++) {
                d.add(paragrafos.get(i));
            }
            d.getPageNumber();
            d.close();
        } catch (FileNotFoundException | DocumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        Desktop dt = Desktop.getDesktop();
        try {
            dt.open(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
        cell.setHorizontalAlignment(align);
        cell.setColspan(colspan);
        if (text.trim().equalsIgnoreCase("")) {
            cell.setMinimumHeight(10f);
        }
        table.addCell(cell);
    }

    private String getNmColuna(String valor) {
        HashMap campos = new HashMap();
        campos.put("Número da OS", "os.NR_ORDEM,");
        campos.put("Data de emissão", "os.DT_EMISSAO,");
        campos.put("Nome do cliente", "os.NM_CLIENTE,");
        campos.put("Nome da rua", "os.NM_RUA,");
        campos.put("Número da rua", "os.NUMERO,");
        campos.put("Complemento", "os.COMPL_CLIENTE,");
        campos.put("Telefone do cliente", "os.NR_TELEFONE,");
        campos.put("Bairro", "os.NM_BAIRRO,");
        campos.put("Serviço a executar", "os.SERVICO_A_EXECUTAR,");
        campos.put("Código da rua", "os.COD_RUA,");

        campos.put("Código do setor", "os.COD_SETOR,");
        campos.put("Número do hidrometro", "os.NR_HIDROMETRO,");
        campos.put("Status da OS", "os.STATUS_OS,");

        campos.put("Bairro", "os.NM_BAIRRO,");
        campos.put("Data inicial", "os.DT_INICIAL,");
        campos.put("Data final", "os.DT_FINAL,");

        campos.put("Observação da execução", "os.DS_OBSERVACAO,");
        campos.put("Equipe", "equipe.NM_EQUIPE,");
        campos.put("Data de cobrança", "os.DT_COBRANCA,");
        campos.put("Referência", "os.REFERENCIA,");
        campos.put("Urgência", "if(os.IE_URGENTE=10,'Sim','Não') urgencia,");
        campos.put("Número do lote", "os.NR_LOTE,");
        campos.put("Contrato", "if(os.CD_LICITACAO=null,'',licitacao.DS_LICITACAO) DS_LICITACAO,");

        for (Object key : campos.keySet()) {
            if (Utilidades.validaString(campos.get(key)).equalsIgnoreCase(valor)) {
                return Utilidades.validaString(key);
            }
        }
        return "";
    }

    private String getNmAtributo(String chave) {
        HashMap campos = new HashMap();
        campos.put("Número da OS", "os.NR_ORDEM,");
        campos.put("Data de emissão", "os.DT_EMISSAO,");
        campos.put("Nome do cliente", "os.NM_CLIENTE,");
        campos.put("Nome da rua", "os.NM_RUA,");
        campos.put("Número da rua", "os.NUMERO,");
        campos.put("Complemento", "os.COMPL_CLIENTE,");
        campos.put("Telefone do cliente", "os.NR_TELEFONE,");
        campos.put("Bairro", "os.NM_BAIRRO,");
        campos.put("Serviço a executar", "os.SERVICO_A_EXECUTAR,");
        campos.put("Código da rua", "os.COD_RUA,");

        campos.put("Código do setor", "os.COD_SETOR,");
        campos.put("Número do hidrometro", "os.NR_HIDROMETRO,");
        campos.put("Status da OS", "os.STATUS_OS,");

        campos.put("Bairro", "os.NM_BAIRRO,");
        campos.put("Data inicial", "os.DT_INICIAL,");
        campos.put("Data final", "os.DT_FINAL,");

        campos.put("Observação da execução", "os.DS_OBSERVACAO,");
        campos.put("Equipe", "equipe.NM_EQUIPE,");
        campos.put("Data de cobrança", "os.DT_COBRANCA,");
        campos.put("Referência", "os.REFERENCIA,");
        campos.put("Urgência", "if(os.IE_URGENTE=10,'Sim','Não') urgencia,");
        campos.put("Número do lote", "os.NR_LOTE,");
        campos.put("Contrato", "if(os.CD_LICITACAO=null,'',licitacao.DS_LICITACAO) DS_LICITACAO,");

        for (Object key : campos.keySet()) {
            if (Utilidades.validaString(campos.get(key)).contains(chave)) {
                return Utilidades.validaString(key);
            }
        }
        return "";
    }
}
