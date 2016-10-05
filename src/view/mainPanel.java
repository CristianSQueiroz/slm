/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.Gestao.GestaoEquipe;
import view.Gestao.GestaoFuncionario;
import view.Gestao.GestaoItemCobranca;
import view.Gestao.GestaoLicitacao;
import view.Gestao.GestaoOrdemServico;
import view.Gestao.GestaoRelatorio;
import view.Gestao.GestaoServicoAExecutar;
import view.Gestao.GestaoUsuario;

/**
 *
 * @author csqueiroz
 */
public class mainPanel extends javax.swing.JPanel {

    /**
     * Creates new form mainPanel
     */
    public mainPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        gestaoFuncionafioJL = new javax.swing.JLabel();
        gestaoUsuarioJL = new javax.swing.JLabel();
        gestaoDeItensDeCobrancaJL = new javax.swing.JLabel();
        gestaoDeEquipesJL = new javax.swing.JLabel();
        gestaoDeServicosAExecutarJL = new javax.swing.JLabel();
        gestaodeordemdeServicoJL = new javax.swing.JLabel();
        gestaoDeContratosJL = new javax.swing.JLabel();
        gestaodeRelatorioJL = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        gestaoFuncionafioJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gestaoFuncionario.png"))); // NOI18N
        gestaoFuncionafioJL.setText("Gestão de funcionários");
        gestaoFuncionafioJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaoFuncionafioJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 31, 0, 0);
        jPanel1.add(gestaoFuncionafioJL, gridBagConstraints);

        gestaoUsuarioJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Imagem000.png"))); // NOI18N
        gestaoUsuarioJL.setText("Gestão de usuários");
        gestaoUsuarioJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaoUsuarioJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 89, 0, 0);
        jPanel1.add(gestaoUsuarioJL, gridBagConstraints);

        gestaoDeItensDeCobrancaJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imagem003.png"))); // NOI18N
        gestaoDeItensDeCobrancaJL.setText("Gestão de itens de cobrança");
        gestaoDeItensDeCobrancaJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaoDeItensDeCobrancaJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 31, 887, 0);
        jPanel1.add(gestaoDeItensDeCobrancaJL, gridBagConstraints);

        gestaoDeEquipesJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imagem001.png"))); // NOI18N
        gestaoDeEquipesJL.setText("Gestão de equipes");
        gestaoDeEquipesJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaoDeEquipesJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 31, 0, 0);
        jPanel1.add(gestaoDeEquipesJL, gridBagConstraints);

        gestaoDeServicosAExecutarJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imagem003.png"))); // NOI18N
        gestaoDeServicosAExecutarJL.setText("Gestão de serviços a executar");
        gestaoDeServicosAExecutarJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaoDeServicosAExecutarJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 78, 0, 136);
        jPanel1.add(gestaoDeServicosAExecutarJL, gridBagConstraints);

        gestaodeordemdeServicoJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gestaodeOrdemservico.png"))); // NOI18N
        gestaodeordemdeServicoJL.setText("Gestão de ordem de serviço");
        gestaodeordemdeServicoJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaodeordemdeServicoJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 89, 0, 0);
        jPanel1.add(gestaodeordemdeServicoJL, gridBagConstraints);

        gestaoDeContratosJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gestaoDeContratos.png"))); // NOI18N
        gestaoDeContratosJL.setText("Gestão de contratos");
        gestaoDeContratosJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaoDeContratosJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 78, 0, 0);
        jPanel1.add(gestaoDeContratosJL, gridBagConstraints);

        gestaodeRelatorioJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imagem002.png"))); // NOI18N
        gestaodeRelatorioJL.setText("Gestão de relátorios");
        gestaodeRelatorioJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestaodeRelatorioJLMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 89, 887, 0);
        jPanel1.add(gestaodeRelatorioJL, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void gestaoUsuarioJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaoUsuarioJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoUsuario(), "Gestão de Usuários");
    }//GEN-LAST:event_gestaoUsuarioJLMouseClicked

    private void gestaoFuncionafioJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaoFuncionafioJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoFuncionario(), "Gestão de Funcionários");
    }//GEN-LAST:event_gestaoFuncionafioJLMouseClicked

    private void gestaoDeContratosJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaoDeContratosJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoLicitacao(), "Gestão de Contratos");
    }//GEN-LAST:event_gestaoDeContratosJLMouseClicked

    private void gestaoDeEquipesJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaoDeEquipesJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoEquipe(), "Gestão de Equipes");
    }//GEN-LAST:event_gestaoDeEquipesJLMouseClicked

    private void gestaodeordemdeServicoJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaodeordemdeServicoJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoOrdemServico(), "Gestão de Ordem de Serviço");
    }//GEN-LAST:event_gestaodeordemdeServicoJLMouseClicked

    private void gestaoDeServicosAExecutarJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaoDeServicosAExecutarJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoServicoAExecutar(), "Gestão de Serviços À Executar");
    }//GEN-LAST:event_gestaoDeServicosAExecutarJLMouseClicked

    private void gestaoDeItensDeCobrancaJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaoDeItensDeCobrancaJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoItemCobranca(), "Gestão de Itens de Cobrança");
    }//GEN-LAST:event_gestaoDeItensDeCobrancaJLMouseClicked

    private void gestaodeRelatorioJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestaodeRelatorioJLMouseClicked
        MainFrameSLM.getInstance().adicionarAba(new GestaoRelatorio(), "Gestão de Relatórios");
    }//GEN-LAST:event_gestaodeRelatorioJLMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gestaoDeContratosJL;
    private javax.swing.JLabel gestaoDeEquipesJL;
    private javax.swing.JLabel gestaoDeItensDeCobrancaJL;
    private javax.swing.JLabel gestaoDeServicosAExecutarJL;
    private javax.swing.JLabel gestaoFuncionafioJL;
    private javax.swing.JLabel gestaoUsuarioJL;
    private javax.swing.JLabel gestaodeRelatorioJL;
    private javax.swing.JLabel gestaodeordemdeServicoJL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
