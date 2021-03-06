/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Cadastro;

import ClassesDeConexao.ItemCobrancaDB;
import ClassesDeConexao.LicitacaoDB;
import ClassesDeConexao.OrdemDeServicoDB;
import ClassesDeConexao.ServicosAExecutarDB;
import Model.Bairros;
import Model.InfoCad;
import Model.Licitacao;
import Model.MaoDeObra;
import Model.OrdemDeServico;
import Model.Status;
import Util.UtilPanel;
import Util.Utilidades;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author csqueiroz
 */
public class CadastroOrdemDeServico extends javax.swing.JPanel {

    private HashMap parametros = new HashMap();

    /**
     * Creates new form CadastroOrdemDeServico
     */
    public CadastroOrdemDeServico() {
        initComponents();
        preencheComboBox();
        jTFNrOrdemDeSerivco.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNrOrdemDeSerivco = new javax.swing.JTextField();
        jTFNmCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCBIeUrgente = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSObrasCivis = new javax.swing.JSpinner();
        jTFRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFReferencia = new javax.swing.JTextField();
        jTFTelefone = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jFTFDtEmissao = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jCBBairro = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jCBServicoAExecutar = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jTFCodRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFCodSetor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFNrHidrometro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jCBItemCobranca = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButtonCadastrar = new Botões.JButtonCadastrar();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCBContrato = new javax.swing.JComboBox();

        jLabel4.setText("jLabel4");

        jLabel1.setText("Nr° da ordem de serviço:");

        jLabel2.setText("Cliente:");

        jTFNrOrdemDeSerivco.setBackground(new java.awt.Color(153, 255, 255));
        jTFNrOrdemDeSerivco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jTFNmCliente.setBackground(new java.awt.Color(153, 255, 255));
        jTFNmCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel3.setText("Rua:");

        jCBIeUrgente.setText("Urgente?");
        jCBIeUrgente.setToolTipText("");

        jLabel5.setText("Data Emissão:");

        jLabel6.setText("Telefone");

        jLabel7.setText("Número:");

        jSObrasCivis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jTFRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel8.setText("Complemento:");

        jTFComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel9.setText("Referência:");

        jTFReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jTFTelefone.setToolTipText("");
        jTFTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jTFNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jFTFDtEmissao.setBackground(new java.awt.Color(153, 255, 255));
        try {
            jFTFDtEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFDtEmissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel10.setText("Bairro:");

        jCBBairro.setBackground(new java.awt.Color(153, 255, 255));

        jLabel11.setText("Serviço à Executar:");

        jCBServicoAExecutar.setBackground(new java.awt.Color(153, 255, 255));

        jLabel12.setText("Cód. Rua:");

        jTFCodRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel13.setText("Cód Setor:");

        jTFCodSetor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel14.setText("Número do hidrômetro:");

        jTFNrHidrometro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel15.setText("Serviço:");

        jLabel17.setText("Descrição");

        jTFQuantidade.setBackground(new java.awt.Color(153, 255, 255));
        jTFQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFQuantidadeKeyPressed(evt);
            }
        });

        jLabel18.setText("Quantidade");

        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabel19.setText("Obras civis:");

        jLabel16.setText("Contrato:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNmCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                                    .addComponent(jTFRua)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNrOrdemDeSerivco, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBContrato, 0, 163, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFTelefone)
                                    .addComponent(jFTFDtEmissao)
                                    .addComponent(jTFNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSObrasCivis, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCBIeUrgente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBServicoAExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(31, 31, 31)
                                .addComponent(jTFReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTFCodRua, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                    .addGap(117, 117, 117)
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTFCodSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(80, 80, 80)
                                                    .addComponent(jLabel14))
                                                .addComponent(jCBItemCobranca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(224, 224, 224)
                                                .addComponent(jLabel17)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTFNrHidrometro)
                                                .addComponent(jTFQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addGap(43, 43, 43)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNrOrdemDeSerivco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSObrasCivis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFDtEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16)
                    .addComponent(jCBContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBIeUrgente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jCBBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jCBServicoAExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTFCodRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTFCodSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTFNrHidrometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBItemCobranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        salvar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTFQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            salvar();
        }
    }//GEN-LAST:event_jTFQuantidadeKeyPressed

    private void salvar() {
        if (verificador()) {
            cadastrar();
        }
    }

    private void preencheComboBox() {
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
        parametros.put("DS_DESCRICAO", null);
        for (HashMap equipe : new ItemCobrancaDB().getItensCobranca(parametros, "ID")) {
            jCBItemCobranca.addItem(equipe.get("DS_DESCRICAO"));
        }
        jCBItemCobranca.setSelectedItem(null);

        parametros.clear();
        parametros.put("DS_LICITACAO", null);
        for (HashMap licitacao : new LicitacaoDB().getLicitacoes(parametros, "ID")) {
            jCBContrato.addItem(licitacao.get("DS_LICITACAO"));
        }
        jCBContrato.setSelectedItem(null);
    }

    private boolean verificador() {
        if (!jTFNrOrdemDeSerivco.getText().trim().equalsIgnoreCase("")) {
            if (!"  /  /    ".equalsIgnoreCase(jFTFDtEmissao.getText()) && Utilidades.getData(jFTFDtEmissao.getText()) != null) {
                if (!jTFNmCliente.getText().trim().equalsIgnoreCase("")) {
                    if (jCBBairro.getSelectedItem() != null) {
                        if (jCBServicoAExecutar.getSelectedItem() != null) {
                            if (jCBItemCobranca.getSelectedItem() != null) {
                                if (!jTFQuantidade.getText().trim().equalsIgnoreCase("")) {
                                    return true;
                                } else {
                                    JOptionPane.showMessageDialog(null, "É necessário possuir uma quantidade para o item de cobrança.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "É necessário possuir um item de cobrança selecionado.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "É necessário possuir um serviço a ser executado selecionado.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "É necessário possuir um bairro selecionado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "É necessário possuir uma cliente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "É necessário possuir uma data de emissão.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necessário possuir um número da Ordem de Serviço.");
        }
        return false;
    }

    private void cadastrar() {
        OrdemDeServico oS = new OrdemDeServico();
        oS.setNumeroOrdem(jTFNrOrdemDeSerivco.getText());
        oS.setDataEmissao(Utilidades.getData(jFTFDtEmissao.getText()));
        oS.setCodRua(Utilidades.validaInt(jTFCodRua.getText()));
        oS.setCodSetor(Utilidades.validaInt(jTFCodSetor.getText()));
        oS.setnHidrometro(Utilidades.validaInt(jTFNrHidrometro.getText()));
        oS.setCliente(jTFNmCliente.getText());
        oS.setTelefoneCliente(Utilidades.validaLong(jTFTelefone.getText()));
        oS.setNumero(Utilidades.validaInt(jTFNumero));
        oS.setObrasCivis(Utilidades.validaInt(jSObrasCivis.getValue()));
        oS.setUrgencia((jCBIeUrgente.isSelected()) ? 10 : 0);
        oS.setBairro((Bairros.valueOf(jCBBairro.getSelectedItem().toString())));
        oS.setRuaCliente(jTFRua.getText());
        oS.setComplementoCliente(jTFComplemento.getText());
        oS.setStatus(Status.LANCADA);
        oS.setReferencia(jTFReferencia.getText());
        oS.setServicosAExecutar(jCBServicoAExecutar.getSelectedItem().toString());

        Licitacao licitacao = new LicitacaoDB().getLicitacao(jCBContrato.getSelectedItem().toString());
        oS.setCdLicitacao(licitacao.getCdLicitacao());
        InfoCad ifc = new InfoCad(0, 0, new ItemCobrancaDB().getIDItemCobranca(jCBItemCobranca.getSelectedItem().toString()), Utilidades.validaDouble(jTFQuantidade.getText().replaceAll(",", ".")));
        //MaoDeObra mdo = new MaoDeObra(0, 0, new ItemCobrancaDB().getIDItemCobranca(jCBItemCobranca.getSelectedItem().toString()), Utilidades.validaInt(jTFQuantidade.getText()), 0);
        if (new OrdemDeServicoDB().CadastrarOrdemDeServico(oS, ifc)) {
            limparCampos();
            jTFNrOrdemDeSerivco.requestFocus();
        }
    }

    private void limparCampos() {
        UtilPanel.limpaCampos(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botões.JButtonCadastrar jButtonCadastrar;
    private javax.swing.JComboBox jCBBairro;
    private javax.swing.JComboBox jCBContrato;
    private javax.swing.JCheckBox jCBIeUrgente;
    private javax.swing.JComboBox jCBItemCobranca;
    private javax.swing.JComboBox jCBServicoAExecutar;
    private javax.swing.JFormattedTextField jFTFDtEmissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSObrasCivis;
    private javax.swing.JTextField jTFCodRua;
    private javax.swing.JTextField jTFCodSetor;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFNmCliente;
    private javax.swing.JTextField jTFNrHidrometro;
    private javax.swing.JTextField jTFNrOrdemDeSerivco;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTextField jTFReferencia;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
