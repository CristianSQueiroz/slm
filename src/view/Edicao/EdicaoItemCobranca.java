/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Edicao;

import ClassesDeConexao.ItemCobrancaDB;
import ClassesDeConexao.ServicosAExecutarDB;
import Contantes.NomesColunasContantes;
import JTPadrao.JCTable;
import Model.ItemCobranca;
import Model.ServicosAExecutar;
import Util.Utilidades;
import java.util.HashMap;
import view.Cadastro.CadastroItemCobranca;
import view.Cadastro.CadastroServicoAExecutar;
import view.Gestao.GestaoItemCobranca;
import view.Gestao.GestaoServicoAExecutar;

/**
 *
 * @author csqueiroz
 */
public class EdicaoItemCobranca extends javax.swing.JPanel {

    private GestaoItemCobranca gestaoIC;

    /**
     * Creates new form EdicaoUsuario
     */
    public EdicaoItemCobranca(GestaoItemCobranca gestaoIC) {
        initComponents();
        carregaLista();
        this.gestaoIC = gestaoIC;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSP = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonAtualizar2 = new Botões.JButtonAtualizar();
        jButtonExcluir1 = new Botões.JButtonExcluir();
        jButtonEditar1 = new Botões.JButtonEditar();

        setLayout(new java.awt.BorderLayout());

        jTable.setAutoCreateColumnsFromModel(false);
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.setName(""); // NOI18N
        jSP.setViewportView(jTable);

        add(jSP, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        jButtonAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtualizar2);

        jButtonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluir1);

        jButtonEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar1);

        add(jPanel1, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizar2ActionPerformed
        carregaLista();
    }//GEN-LAST:event_jButtonAtualizar2ActionPerformed

    private void jButtonEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar1ActionPerformed
        carregaPanelCadastro();
    }//GEN-LAST:event_jButtonEditar1ActionPerformed

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        int coluna = ((JCTable) jTable).getColuna("ID");
        if (new ItemCobrancaDB().excluirItemCobranca(Utilidades.validaInt(jTable.getValueAt(jTable.getSelectedRow(), coluna)))) {
            carregaLista();
        }
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed

    private void carregaPanelCadastro() {
        int coluna = ((JCTable) jTable).getColuna("ID");
        ItemCobranca iC = new ItemCobrancaDB().getItemCobranca(Utilidades.validaInt(jTable.getValueAt(jTable.getSelectedRow(), coluna)));
        ((CadastroItemCobranca) gestaoIC.getPanelNorte()).setItemCobranca(iC);
    }

    private void carregaLista() {
        HashMap parametros = new HashMap();
        parametros.put("ID", null);
        parametros.put("DS_DESCRICAO", null);
        parametros.put("VALOR", null);

        jTable = new JCTable(new ItemCobrancaDB().getItensCobranca(parametros,null), new NomesColunasContantes().getNomesColunas());
        jSP.setViewportView(jTable);
        jTable.validate();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botões.JButtonAtualizar jButtonAtualizar2;
    private Botões.JButtonEditar jButtonEditar1;
    private Botões.JButtonExcluir jButtonExcluir1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSP;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
