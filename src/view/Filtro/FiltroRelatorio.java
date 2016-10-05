/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Filtro;

import ClassesDeConexao.EquipeDB;
import ClassesDeConexao.ItemCobrancaDB;
import ClassesDeConexao.LicitacaoDB;
import ClassesDeConexao.OrdemDeServicoDB;
import ClassesDeConexao.RelatorioDB;
import ClassesDeConexao.ServicosAExecutarDB;
import Contantes.NomesColunasContantes;
import Contantes.Procedures;
import JTPadrao.JCTable;
import Model.Bairros;
import Model.GerarRelatorio;
import Model.Status;
import Util.UtilPanel;
import Util.UtilSql;
import Util.Utilidades;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.SimpleFormatter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import view.Cadastro.CadastroDeRelatorios;
import view.Gestao.GestaoRelatorio;
import view.MainFrameSLM;

/**
 *
 * @author csqueiroz
 */
public class FiltroRelatorio extends javax.swing.JPanel {

    private GestaoRelatorio gestaoRelatorio;
    private HashMap parametros = new HashMap();
    private HashMap restricoesGeral = new HashMap();
    private ArrayList<HashMap> retorno = new ArrayList();

    /**
     * Creates new form FiltroGestaoOrdemServico
     */
    public FiltroRelatorio(GestaoRelatorio gestaoRelatorio) {
        this.gestaoRelatorio = gestaoRelatorio;
        initComponents();
        preencheComboBox();
        jButtonAtualizar1.doClick();
        jLabel8.setVisible(false);
        jCBLote.setVisible(false);
        jLabel12.setVisible(false);
        jFTFDataCobranca.setVisible(false);
        label3.setVisible(false);
        jFTFDataCobranca1.setVisible(false);

    }

    public KeyListener getKeyListener() {
        return new KeyListener() {

            @Override
            public void keyTyped(KeyEvent evt) {

            }

            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    if (evt.getComponent() instanceof JComboBox) {
                        ((JComboBox) evt.getComponent()).setSelectedItem(null);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent evt) {
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCBSomenteUrgentes = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFNrOS = new javax.swing.JTextField();
        jTFNmCliente = new javax.swing.JTextField();
        jTFNmRua = new javax.swing.JTextField();
        jCBBairro = new javax.swing.JComboBox();
        jCBServicoAExecutar = new javax.swing.JComboBox();
        jCBStatus = new javax.swing.JComboBox();
        jCBEquipe = new javax.swing.JComboBox();
        jCBContrato = new javax.swing.JComboBox();
        jCBLote = new javax.swing.JComboBox();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jFTFDataEmissao = new javax.swing.JFormattedTextField();
        jFTFDataEmissao1 = new javax.swing.JFormattedTextField();
        jFTFDataInicio = new javax.swing.JFormattedTextField();
        jFTFDataInicio1 = new javax.swing.JFormattedTextField();
        jFTFDataFinal = new javax.swing.JFormattedTextField();
        jFTFDataFinal1 = new javax.swing.JFormattedTextField();
        jFTFDataCobranca = new javax.swing.JFormattedTextField();
        jFTFDataCobranca1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCTable1 = new JTPadrao.JCTable();
        jButtonAtualizar1 = new Botões.JButtonAtualizar();
        jButtonExcluir1 = new Botões.JButtonExcluir();
        jButtonImprimir1 = new Botões.JButtonImprimir();
        jButtonTestar1 = new Botões.JButtonTestar();
        jButtonNovoRelatorio1 = new Botões.JButtonNovoRelatorio();
        jLabel15 = new javax.swing.JLabel();
        jCBItemCobranca = new javax.swing.JComboBox();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número da OS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 9, -1, -1));

        jLabel2.setText("Serviços à executar:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 141, -1, -1));

        jLabel3.setText("Rua:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 77, -1, -1));

        jLabel4.setText("Bairro:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, -1, -1));

        jLabel5.setText("Status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 174, -1, -1));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 3, -1, -1));

        jLabel7.setText("Equipe:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 206, -1, -1));

        jCBSomenteUrgentes.setText("Somente Urgentes");
        add(jCBSomenteUrgentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel8.setText("Lote:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel9.setText("Data de emissão:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel10.setText("Data de inicio da Execução:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel11.setText("Data final da Execução:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel13.setText("Cliente:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 43, -1, -1));

        jLabel14.setText("Contratos:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        add(jTFNrOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 3, 300, -1));
        add(jTFNmCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 37, 300, -1));
        add(jTFNmRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 71, 300, -1));
        add(jCBBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 105, 300, -1));

        add(jCBServicoAExecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 137, 300, -1));

        add(jCBStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 169, 300, -1));

        add(jCBEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 201, 300, -1));

        add(jCBContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 263, 300, -1));

        jCBLote.setEnabled(false);
        add(jCBLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 300, -1));

        label.setText("à");
        add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        label1.setText("à");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 9, -1));

        label2.setText("à");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel12.setText("Data de cobraça:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        label3.setText("à");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        try {
            jFTFDataEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataEmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 86, -1));

        try {
            jFTFDataEmissao1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataEmissao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 86, -1));

        try {
            jFTFDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 86, -1));

        try {
            jFTFDataInicio1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 86, -1));

        try {
            jFTFDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 86, -1));

        try {
            jFTFDataFinal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataFinal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 86, -1));

        try {
            jFTFDataCobranca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataCobranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 86, -1));

        try {
            jFTFDataCobranca1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFTFDataCobranca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 86, -1));

        jCTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jCTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 0, 518, 403));

        jButtonAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizar1ActionPerformed(evt);
            }
        });
        add(jButtonAtualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jButtonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir1ActionPerformed(evt);
            }
        });
        add(jButtonExcluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jButtonImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimir1ActionPerformed(evt);
            }
        });
        add(jButtonImprimir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, -1, -1));

        jButtonTestar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestar1ActionPerformed(evt);
            }
        });
        add(jButtonTestar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, -1, -1));

        jButtonNovoRelatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoRelatorio1ActionPerformed(evt);
            }
        });
        add(jButtonNovoRelatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        jLabel15.setText("Serviços de cobranças:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 238, -1, -1));

        add(jCBItemCobranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 233, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizar1ActionPerformed
        parametros.clear();
        parametros.put("ID", null);
        parametros.put("NM_RELATORIO", null);
        parametros.put("DS_ORIENTACAO", null);
        jCTable1 = new JCTable(new RelatorioDB().getRelatorios(parametros, "NM_RELATORIO"), new NomesColunasContantes().getNomesColunas());
        jScrollPane1.setViewportView(jCTable1);
        jCTable1.validate();

    }//GEN-LAST:event_jButtonAtualizar1ActionPerformed

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        parametros.clear();
        parametros.put("ID", null);
        for (HashMap hm : jCTable1.getValoresLinhasSelecionadas(parametros)) {
            new RelatorioDB().excluirRelatorio(Utilidades.validaInt(hm.get("ID")));
            jButtonAtualizar1ActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed

    private void jButtonImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimir1ActionPerformed
        parametros.clear();
        parametros.put("ID", null);
        for (HashMap hm : jCTable1.getValoresLinhasSelecionadas(parametros)) {
            GerarRelatorio gerarRelatorio = new GerarRelatorio(new RelatorioDB().getRelatorio(Utilidades.validaInt(hm.get("ID"))), montarRestricoes(), null);
        }
    }//GEN-LAST:event_jButtonImprimir1ActionPerformed

    private void jButtonTestar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestar1ActionPerformed
        ArrayList<HashMap> qtRegistros = new RelatorioDB().getRegistros("SELECT COUNT(*)", montarRestricoes(), null);
        if (qtRegistros.size() == 0) {
            JOptionPane.showMessageDialog(this, "Foram encontrados " + Utilidades.validaInt(qtRegistros.get(0).get("COUNT(*)")) + " OS's com o filtro selecionado.");
        } else {
            JOptionPane.showMessageDialog(this, "Foram encontrados " + Utilidades.validaInt(qtRegistros.get(0).get("COUNT(*)")) + " OS's com o filtro selecionado.");
        }

    }//GEN-LAST:event_jButtonTestar1ActionPerformed

    private void jButtonNovoRelatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoRelatorio1ActionPerformed
        MainFrameSLM.getInstance().adicionarAba(new CadastroDeRelatorios(), "Cadastro de relatórios");
    }//GEN-LAST:event_jButtonNovoRelatorio1ActionPerformed

    private void preencheComboBox() {
        for (Status s : Status.values()) {
            jCBStatus.addItem(s.toString());
        }
        jCBStatus.setSelectedItem(null);

        for (Bairros b : Bairros.values()) {
            jCBBairro.addItem(b.toString());
        }
        jCBBairro.setSelectedItem(null);

        parametros.clear();
        parametros.put("DS_SERVICO", null);
        for (HashMap sae : new ServicosAExecutarDB().getServicosAExecutar(parametros, "DS_SERVICO")) {
            jCBServicoAExecutar.addItem(sae.get("DS_SERVICO"));
        }
        jCBServicoAExecutar.setSelectedItem(null);

        parametros.clear();
        parametros.put("NM_EQUIPE", null);

        for (HashMap equipe : new EquipeDB().getEquipes(parametros, "NM_EQUIPE")) {
            jCBEquipe.addItem(equipe.get("NM_EQUIPE"));
        }
        jCBEquipe.setSelectedItem(null);

        parametros.clear();
        parametros.put("DS_DESCRICAO", null);

        for (HashMap itemCobranca : new ItemCobrancaDB().getItensCobranca(parametros, "DS_DESCRICAO")) {
            jCBItemCobranca.addItem(itemCobranca.get("DS_DESCRICAO"));
        }
        jCBItemCobranca.setSelectedItem(null);

        parametros.clear();
        parametros.put("DS_LICITACAO", null);

        for (HashMap contrato : new LicitacaoDB().getLicitacoes(parametros, "DS_LICITACAO")) {
            jCBContrato.addItem(contrato.get("DS_LICITACAO"));
        }
        jCBContrato.setSelectedItem(null);
        UtilPanel.adicionarKeyListener(this, getKeyListener());
    }

    public HashMap montarRestricoes() {
        SimpleFormatter sf = new SimpleFormatter();
        HashMap restricoes = new HashMap();
        if (!jTFNrOS.getText().trim().equalsIgnoreCase("")) {
            restricoes.put("os.NR_ORDEM", UtilSql.prepararLike(jTFNrOS.getText(), true, false, false));
        }
        if (!jTFNmCliente.getText().trim().equalsIgnoreCase("")) {
            restricoes.put("os.NM_CLIENTE", UtilSql.prepararLike(jTFNmCliente.getText(), false, true, false));
        }
        if (!jTFNmRua.getText().trim().equalsIgnoreCase("")) {
            restricoes.put("os.NM_RUA", UtilSql.prepararLike(jTFNmRua.getText(), false, true, false));
        }
        if (jCBBairro.getSelectedItem() != null) {
            restricoes.put("os.NM_BAIRRO", UtilSql.aplicarApostofo(jCBBairro.getSelectedItem().toString()));
        }
        if (jCBServicoAExecutar.getSelectedItem() != null) {
            restricoes.put("os.SERVICO_A_EXECUTAR", UtilSql.aplicarApostofo(jCBServicoAExecutar.getSelectedItem().toString()));
        }
        if (jCBStatus.getSelectedItem() != null) {
            restricoes.put("os.STATUS_OS", UtilSql.aplicarApostofo(jCBStatus.getSelectedItem().toString()));
        }
        if (jCBItemCobranca.getSelectedItem() != null) {
            parametros.clear();
            parametros.put("ID", null);

            restricoesGeral.clear();
            restricoesGeral.put("DS_DESCRICAO", UtilSql.aplicarApostofo(jCBItemCobranca.getSelectedItem().toString()));

            retorno.clear();
            retorno = new ItemCobrancaDB().getItensCobranca(parametros, restricoesGeral, null);

            restricoes.put("PROCEDURE", new Procedures().ObterSeVinculoOSItemCobrancaRel(retorno.get(0).get("ID").toString()));
        }

        if (jCBEquipe.getSelectedItem() != null) {
            parametros.clear();
            parametros.put("ID", null);

            restricoesGeral.clear();
            restricoesGeral.put("NM_EQUIPE", UtilSql.aplicarApostofo(jCBEquipe.getSelectedItem().toString()));

            retorno.clear();
            retorno = new EquipeDB().getEquipes(parametros, restricoesGeral, null);

            restricoes.put("os.NR_EQUIPE", retorno.get(0).get("ID"));
        }
        if (jCBContrato.getSelectedItem() != null) {
            restricoes.put("licitacao.DS_LICITACAO", UtilSql.aplicarApostofo(jCBContrato.getSelectedItem().toString()));
        }
        if (jCBLote.getSelectedItem() != null) {
            restricoes.put("os.NR_LOTE", jCBLote.getSelectedItem().toString());
        }
        if (!"  /  /    ".equalsIgnoreCase(jFTFDataEmissao.getText()) && Utilidades.getData(jFTFDataEmissao.getText()) != null) {
            if (Utilidades.getData(jFTFDataEmissao1.getText()) != null) {
                restricoes.put("os.DT_EMISSAO", UtilSql.preparaDataBetWeen(jFTFDataEmissao.getText(), jFTFDataEmissao1.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "É necessário possuir uma data de emissão inicial e final válidas");
            }

        }
        if (!"  /  /    ".equalsIgnoreCase(jFTFDataInicio.getText()) && Utilidades.getData(jFTFDataInicio.getText()) != null) {
            if (Utilidades.getData(jFTFDataInicio1.getText()) != null) {
                restricoes.put("os.DT_INICIAL", UtilSql.preparaDataBetWeen(jFTFDataInicio.getText(), jFTFDataInicio1.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "É necessário possuir uma data de execução inicial e final válidas");
            }
        }
        if (!"  /  /    ".equalsIgnoreCase(jFTFDataFinal.getText()) && Utilidades.getData(jFTFDataFinal.getText()) != null) {
            if (Utilidades.getData(jFTFDataFinal1.getText()) != null) {
                restricoes.put("os.DT_FINAL", UtilSql.preparaDataBetWeen(jFTFDataFinal.getText(), jFTFDataFinal1.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "É necessário possuir uma data de finalização inicial e final válidas");
            }
        }
        if (!"  /  /    ".equalsIgnoreCase(jFTFDataCobranca.getText()) && Utilidades.getData(jFTFDataCobranca.getText()) != null) {
            if (Utilidades.getData(jFTFDataCobranca1.getText()) != null) {
                restricoes.put("os.DT_COBRANCA", UtilSql.preparaDataBetWeen(jFTFDataCobranca.getText(), jFTFDataCobranca1.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "É necessário possuir uma data de cobrança inicial e final válidas");
            }
        }
        if (jCBSomenteUrgentes.isSelected()) {
            restricoes.put("os.IE_URGENCIA", "10");
        }
        return restricoes;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botões.JButtonAtualizar jButtonAtualizar1;
    private Botões.JButtonExcluir jButtonExcluir1;
    private Botões.JButtonImprimir jButtonImprimir1;
    private Botões.JButtonNovoRelatorio jButtonNovoRelatorio1;
    private Botões.JButtonTestar jButtonTestar1;
    private javax.swing.JComboBox jCBBairro;
    private javax.swing.JComboBox jCBContrato;
    private javax.swing.JComboBox jCBEquipe;
    private javax.swing.JComboBox jCBItemCobranca;
    private javax.swing.JComboBox jCBLote;
    private javax.swing.JComboBox jCBServicoAExecutar;
    private javax.swing.JCheckBox jCBSomenteUrgentes;
    private javax.swing.JComboBox jCBStatus;
    private JTPadrao.JCTable jCTable1;
    private javax.swing.JFormattedTextField jFTFDataCobranca;
    private javax.swing.JFormattedTextField jFTFDataCobranca1;
    private javax.swing.JFormattedTextField jFTFDataEmissao;
    private javax.swing.JFormattedTextField jFTFDataEmissao1;
    private javax.swing.JFormattedTextField jFTFDataFinal;
    private javax.swing.JFormattedTextField jFTFDataFinal1;
    private javax.swing.JFormattedTextField jFTFDataInicio;
    private javax.swing.JFormattedTextField jFTFDataInicio1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNmCliente;
    private javax.swing.JTextField jTFNmRua;
    private javax.swing.JTextField jTFNrOS;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}
