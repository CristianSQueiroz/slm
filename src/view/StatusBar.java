/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author csqueiroz
 */
public class StatusBar extends javax.swing.JPanel {

    /**
     * Creates new form StatusBar
     */
    public StatusBar() {
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

        jLabelVersion = new javax.swing.JLabel();
        jLprocesso = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();

        jLabelVersion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVersion.setToolTipText("");
        jLabelVersion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelVersion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelVersion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLprocesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLprocesso.setToolTipText("");
        jLprocesso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLprocesso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLprocesso.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLUsuario.setToolTipText("");
        jLUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLUsuario.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLprocesso, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLprocesso, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabelVersion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setVersion(String version) {
        jLabelVersion.setText("Versão: " + version);
    }

    public void setUsuario(String usuario) {
        jLUsuario.setText("Usuario: " + usuario);
    }

    public void setProcesso(String processo) {
        jLprocesso.setText(processo);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JLabel jLprocesso;
    // End of variables declaration//GEN-END:variables
}
