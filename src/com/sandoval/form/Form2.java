/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.sandoval.form;

/**
 *
 * @author Sandoval
 */
public class Form2 extends javax.swing.JPanel {

    /**
     * Creates new form Form1
     */
    public Form2() {
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

        panelBorder1 = new com.sandoval.swing.PanelBorder();
        titulo = new javax.swing.JLabel();
        txtNomeGenerico2 = new javax.swing.JTextField();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        titulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(127, 127, 127));
        titulo.setText("DEMONSTRATIVO");

        txtNomeGenerico2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNomeGenerico2.setForeground(new java.awt.Color(204, 204, 204));
        txtNomeGenerico2.setText("Nome do produto");
        txtNomeGenerico2.setBorder(null);
        txtNomeGenerico2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeGenerico2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(txtNomeGenerico2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(titulo)
                .addGap(52, 52, 52)
                .addComponent(txtNomeGenerico2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeGenerico2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeGenerico2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeGenerico2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.sandoval.swing.PanelBorder panelBorder1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtNomeGenerico2;
    // End of variables declaration//GEN-END:variables
}
