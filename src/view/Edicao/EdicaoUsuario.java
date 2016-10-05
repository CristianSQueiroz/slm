/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Edicao;

import ClassesDeConexao.UsuarioDB;
import Contantes.NomesColunasContantes;
import JTPadrao.JCTable;
import Model.Usuario;
import Util.Utilidades;
import java.util.HashMap;
import javax.swing.JTable;
import view.Cadastro.CadastroUsuario;
import view.Gestao.GestaoUsuario;

/**
 *
 * @author csqueiroz
 */
public class EdicaoUsuario extends javax.swing.JPanel {

    private GestaoUsuario gestaoUsuario;

    /**
     * Creates new form EdicaoUsuario
     */
    public EdicaoUsuario(GestaoUsuario gU) {
        gestaoUsuario = gU;
        initComponents();
        carregaLista();
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
        jButtonAtualizar1 = new Botões.JButtonAtualizar();
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
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jSP.setViewportView(jTable);

        add(jSP, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        jButtonAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAtualizar1);

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

    private void jButtonAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizar1ActionPerformed
        carregaLista();
    }//GEN-LAST:event_jButtonAtualizar1ActionPerformed

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        int coluna = ((JCTable) jTable).getColuna("ID");
        if (new UsuarioDB().excluirUsuario(Utilidades.validaInt(jTable.getValueAt(jTable.getSelectedRow(), coluna)))) {
            carregaLista();
        }
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed

    private void jButtonEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar1ActionPerformed
        carregaPanelCadastro();
    }//GEN-LAST:event_jButtonEditar1ActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
       if(evt.getClickCount()>2){
           carregaPanelCadastro();
       }
    }//GEN-LAST:event_jTableMouseClicked

    private void carregaPanelCadastro() {
        int coluna = ((JCTable) jTable).getColuna("ID");
        Usuario u = new UsuarioDB().getUsuario(Utilidades.validaInt(jTable.getValueAt(jTable.getSelectedRow(), coluna)));
        ((CadastroUsuario) gestaoUsuario.getPanelNorte()).setUsuario(u);
    }

    private void carregaLista() {
        HashMap parametros = new HashMap();
        parametros.put("ID", null);
        parametros.put("NR_FUNCIONARIO", null);
        parametros.put("NM_USUARIO", null);

        jTable = new JCTable(new UsuarioDB().getUsuarios(parametros,null), new NomesColunasContantes().getNomesColunas());
        jSP.setViewportView(jTable);
        jTable.validate();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botões.JButtonAtualizar jButtonAtualizar1;
    private Botões.JButtonEditar jButtonEditar1;
    private Botões.JButtonExcluir jButtonExcluir1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSP;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
