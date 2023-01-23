
package com.sandoval.form;

import com.sandoval.model.ModelCard;
import com.sandoval.model.StatusType;
import com.sandoval.swing.ScrollBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class FormHome extends javax.swing.JPanel {

    
    public FormHome() {
        initComponents();
        card1.setData(new ModelCard(new ImageIcon(getClass().getResource("/com/sandoval/icon/stock.png")), "Stock Total", "$200000", "Incresed by 60%"));
        card2.setData(new ModelCard(new ImageIcon(getClass().getResource("/com/sandoval/icon/profit.png")), "Total Profit", "$15000", "Incresed by 25%"));
        card3.setData(new ModelCard(new ImageIcon(getClass().getResource("/com/sandoval/icon/flag.png")), "Unique visitors", "$300000", "Incresed by 70%"));
        
        // add row table
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        table.addRow(new Object[] {"José Sandoval", "jose.neto13@ba.estudante.senai.br", "Vendedor", "21 out,2020", StatusType.PENDING});
        table.addRow(new Object[] {"Vinicius", "vinicius@ba.estudante.senai.br", "Vendedor", "10 out,2020", StatusType.APPROVED});
        table.addRow(new Object[] {"Leonardo", "leonardo@ba.estudante.senai.br", "Vendedor", "02 set,2020", StatusType.APPROVED});
        table.addRow(new Object[] {"José Sandoval", "jose.neto13@ba.estudante.senai.br", "Admin", "21 out,2020", StatusType.REJECT});
        table.addRow(new Object[] {"Vinicius", "vinicius@ba.estudante.senai.br", "Admin", "10 out,2020", StatusType.PENDING});
        table.addRow(new Object[] {"Leonardo", "leonardo@ba.estudante.senai.br", "Admin", "02 set,2020", StatusType.APPROVED});
        table.addRow(new Object[] {"José Sandoval", "jose.neto13@ba.estudante.senai.br", "Caixa", "21 out,2020", StatusType.APPROVED});
        table.addRow(new Object[] {"Vinicius", "vinicius@ba.estudante.senai.br", "Caixa", "10 out,2020", StatusType.REJECT});
        table.addRow(new Object[] {"Leonardo", "leonardo@ba.estudante.senai.br", "Caixa", "02 set,2020", StatusType.PENDING});
        table.addRow(new Object[] {"José Sandoval", "jose.neto13@ba.estudante.senai.br", "Gerente", "21 out,2020", StatusType.PENDING});
        table.addRow(new Object[] {"Vinicius", "vinicius@ba.estudante.senai.br", "Gerente", "10 out,2020", StatusType.APPROVED});
        table.addRow(new Object[] {"Leonardo", "leonardo@ba.estudante.senai.br", "Gerente", "02 set,2020", StatusType.APPROVED});
        table.addRow(new Object[] {"José Sandoval", "jose.neto13@ba.estudante.senai.br", "Vendedor", "21 out,2020", StatusType.REJECT});
        table.addRow(new Object[] {"Vinicius", "vinicius@ba.estudante.senai.br", "Vendedor", "10 out,2020", StatusType.PENDING});
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.sandoval.component.Card();
        card2 = new com.sandoval.component.Card();
        card3 = new com.sandoval.component.Card();
        panelBorder1 = new com.sandoval.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.sandoval.swing.Table();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Standard Table Desing ");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "User Type", "Joined", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spTable))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.sandoval.component.Card card1;
    private com.sandoval.component.Card card2;
    private com.sandoval.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.sandoval.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.sandoval.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
