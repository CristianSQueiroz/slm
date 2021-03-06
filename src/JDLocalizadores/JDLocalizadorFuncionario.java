/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDLocalizadores;

import ClassesDeConexao.FuncionarioDB;
import ClassesDeConexao.UsuarioDB;
import Contantes.NomesColunasContantes;
import JTPadrao.JCTable;
import JTPadrao.JTPadrao;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import view.Cadastro.CadastroEquipe;
import view.Cadastro.CadastroUsuario;
import view.MainFrameSLM;

/**
 *
 * @author csqueiroz
 */
public class JDLocalizadorFuncionario extends javax.swing.JDialog {

    private Object retorno;
    private JPanel pai;

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form JDLocalizador
     */
    public JDLocalizadorFuncionario(JPanel principal) {
        initComponents();
        pai = principal;
    }

    public void ativar() {
        MainFrameSLM.getInstance().setVisible(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    public Object getRetorno() {

        return retorno;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLocalizar = new Botões.JButtonLocalizar();
        jButtonOK = new Botões.JButtonOK();
        jButtonCancel = new Botões.JButtonCancel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFNmFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFPIS = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jButtonLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalizarActionPerformed(evt);
            }
        });

        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel1.setText("Código:");

        jTFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFIDKeyPressed(evt);
            }
        });

        jLabel2.setText("Nome do funcionário:");

        jTFNmFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNmFuncionarioKeyPressed(evt);
            }
        });

        jLabel3.setText("PIS:");

        jTFPIS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPISKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPIS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNmFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNmFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFPIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        preencheRetorno();
        MainFrameSLM.getInstance().setVisible(true);
        doClose(RET_CANCEL);
        if (pai instanceof CadastroUsuario) {
            ((CadastroUsuario) pai).atualizaRetorno();
        }else if(pai instanceof CadastroEquipe){
            ((CadastroEquipe) pai).atualizaRetorno();
        }

    }//GEN-LAST:event_closeDialog

    private void jButtonLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalizarActionPerformed
        localizar();
    }//GEN-LAST:event_jButtonLocalizarActionPerformed

    private void jTFIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            localizar();
        }
    }//GEN-LAST:event_jTFIDKeyPressed

    private void jTFNmFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNmFuncionarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            localizar();
        }
    }//GEN-LAST:event_jTFNmFuncionarioKeyPressed

    private void jTFPISKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPISKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            localizar();
        }
    }//GEN-LAST:event_jTFPISKeyPressed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        closeDialog(null);
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        if (evt.getClickCount() > 2) {
            closeDialog(null);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        closeDialog(null);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void localizar() {
        HashMap parametros = new HashMap();
        HashMap restricoes = new HashMap();
        if (!jTFID.getText().trim().equalsIgnoreCase("")) {
            restricoes.put("ID", jTFID.getText());
        }
        if (!jTFNmFuncionario.getText().trim().equalsIgnoreCase("")) {
            restricoes.put("NM_FUNCIONARIO", new Util.UtilSql().prepararLike(jTFNmFuncionario.getText(),false,true,false));
        }

        if (!jTFPIS.getText().trim().equalsIgnoreCase("")) {
            restricoes.put("PIS", jTFPIS.getText());
        }
        parametros.put("ID", null);
        parametros.put("NM_FUNCIONARIO", null);
        parametros.put("PIS", null);

        jTable = new JCTable(new FuncionarioDB().getFuncionarios(parametros, restricoes,null), new NomesColunasContantes().getNomesColunas());
        jScrollPane1.setViewportView(jTable);
        jTable.validate();
    }

    private void preencheRetorno() {
        retorno = jTable.getValueAt(jTable.getSelectedRow(), ((JCTable) jTable).getColuna("ID"));
    }

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botões.JButtonCancel jButtonCancel;
    private Botões.JButtonLocalizar jButtonLocalizar;
    private Botões.JButtonOK jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNmFuncionario;
    private javax.swing.JTextField jTFPIS;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
