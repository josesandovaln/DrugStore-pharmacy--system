/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sandoval.login;

import com.sandoval.model.beans.Cadastro;
import com.sandoval.model.dao.CadastroDao;
import java.awt.Color;

/**
 *
 * @author Sandoval
 */
public class TelaCadastrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarUsuario
     */
    
    int xMouse, yMouse;
    
    public TelaCadastrarUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        imgEsq = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        extBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        separadorUm = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        usuario = new javax.swing.JLabel();
        separadorDois = new javax.swing.JSeparator();
        senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        separadorTres = new javax.swing.JSeparator();
        telefone = new javax.swing.JLabel();
        separadorQuatro = new javax.swing.JSeparator();
        endereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        separadorSeis = new javax.swing.JSeparator();
        bairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        separadorCinco = new javax.swing.JSeparator();
        cidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        separadorOito = new javax.swing.JSeparator();
        numEndereco = new javax.swing.JLabel();
        separadorSete = new javax.swing.JSeparator();
        cep = new javax.swing.JLabel();
        separadorNove = new javax.swing.JSeparator();
        cadastrarBtn = new javax.swing.JPanel();
        cadastrar = new javax.swing.JLabel();
        txfCep = new javax.swing.JFormattedTextField();
        txfTelefone = new javax.swing.JFormattedTextField();
        txfNumero = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgEsq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgEsq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sandoval/icon/logoesq.jpg"))); // NOI18N
        imgEsq.setToolTipText("");
        jPanel1.add(imgEsq, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 340, 730));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        extBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout extBtnLayout = new javax.swing.GroupLayout(extBtn);
        extBtn.setLayout(extBtnLayout);
        extBtnLayout.setHorizontalGroup(
            extBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        extBtnLayout.setVerticalGroup(
            extBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(extBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 790, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(extBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        titulo.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        titulo.setText("CADASTRO DE VENDEDOR");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        nome.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        nome.setText("Nome:");
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        txtNome.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setText("Informe seu nome.");
        txtNome.setBorder(null);
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 490, 30));

        separadorUm.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 490, 10));

        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Informe seu usuario.");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 490, 30));

        usuario.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        usuario.setText("Usuario:");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        separadorDois.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorDois, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 490, 10));

        senha.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        senha.setText("Senha:");
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        txtSenha.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(204, 204, 204));
        txtSenha.setText("Informe sua senha.");
        txtSenha.setBorder(null);
        txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaMouseClicked(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 490, 30));

        separadorTres.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 490, 10));

        telefone.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        telefone.setText("Telefone:");
        jPanel1.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 30));

        separadorQuatro.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorQuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 490, 10));

        endereco.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        endereco.setText("Endereço:");
        jPanel1.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 30));

        txtEndereco.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(204, 204, 204));
        txtEndereco.setText("Informe seu endereço.");
        txtEndereco.setBorder(null);
        txtEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnderecoMouseClicked(evt);
            }
        });
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 340, 30));

        separadorSeis.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 340, 10));

        bairro.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        bairro.setText("Bairro:");
        jPanel1.add(bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 30));

        txtBairro.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(204, 204, 204));
        txtBairro.setText("Informe o bairro.");
        txtBairro.setBorder(null);
        txtBairro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBairroMouseClicked(evt);
            }
        });
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 180, 30));

        separadorCinco.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 180, 10));

        cidade.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cidade.setText("Cidade:");
        jPanel1.add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, 30));

        txtCidade.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(204, 204, 204));
        txtCidade.setText("Informe a sua cidade.");
        txtCidade.setBorder(null);
        txtCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCidadeMouseClicked(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 180, 30));

        separadorOito.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorOito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 180, 10));

        numEndereco.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        numEndereco.setText("Nº:");
        jPanel1.add(numEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, 30));

        separadorSete.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorSete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 140, 10));

        cep.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cep.setText("CEP");
        jPanel1.add(cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, 30));

        separadorNove.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(separadorNove, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 110, 10));

        cadastrarBtn.setBackground(new java.awt.Color(163, 193, 219));

        cadastrar.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrar.setText("CADASTRAR");
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cadastrarBtnLayout = new javax.swing.GroupLayout(cadastrarBtn);
        cadastrarBtn.setLayout(cadastrarBtnLayout);
        cadastrarBtnLayout.setHorizontalGroup(
            cadastrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        cadastrarBtnLayout.setVerticalGroup(
            cadastrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(cadastrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 160, 50));

        txfCep.setBorder(null);
        txfCep.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfCep.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfCep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfCepMouseClicked(evt);
            }
        });
        jPanel1.add(txfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 110, 30));

        txfTelefone.setBorder(null);
        txfTelefone.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfTelefoneMouseClicked(evt);
            }
        });
        jPanel1.add(txfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 490, 30));

        txfNumero.setBorder(null);
        txfNumero.setForeground(new java.awt.Color(204, 204, 204));
        try {
            txfNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("nº ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfNumeroMouseClicked(evt);
            }
        });
        jPanel1.add(txfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked

        System.exit(0);

    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered

        extBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);

    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited

        extBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);

    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x- xMouse,y - yMouse);

    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_headerMousePressed

    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        
        this.dispose();
        
        // info banco
        
        Cadastro cadastro = new Cadastro();
        CadastroDao dao = new CadastroDao();
        
        cadastro.setNome(txtNome.getText());
        cadastro.setUsuario(txtUsuario.getText());
        cadastro.setSenha(txtSenha.getText());
        cadastro.setTelefone(txfTelefone.getText());
        cadastro.setEndereco(txtEndereco.getText());
        cadastro.setNumero(txfNumero.getText());
        cadastro.setBairro(txtBairro.getText());
        cadastro.setCidade(txtCidade.getText());
        cadastro.setCep(txfCep.getText());
        
        dao.create(cadastro);
        
        
    }//GEN-LAST:event_cadastrarMouseClicked

    private void cadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseEntered
        cadastrarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_cadastrarMouseEntered

    private void cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseExited
        cadastrarBtn.setBackground(new Color(163, 193, 219));
    }//GEN-LAST:event_cadastrarMouseExited

    private void txfCepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCepMouseClicked
        if(txfCep.getText().equals("     -   ")) {
            txfCep.setText("");
            txfCep.setForeground(Color.black);
        }
    }//GEN-LAST:event_txfCepMouseClicked

    private void txfTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfTelefoneMouseClicked
        if(txfTelefone.getText().equals("(  )      -    ")) {
            txfTelefone.setText("");
            txfTelefone.setForeground(Color.black);
        }
    }//GEN-LAST:event_txfTelefoneMouseClicked

    private void txfNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNumeroMouseClicked
        if(txfNumero.getText().equals("nº     ")) {
            txfNumero.setText("");
            txfNumero.setForeground(Color.black);
        }
    }//GEN-LAST:event_txfNumeroMouseClicked

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        if(txtNome.getText().equals("Informe seu nome.")) {
            txtNome.setText(""); 
            txtNome.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        if(txtUsuario.getText().equals("Informe seu usuario.")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked
        if(txtSenha.getText().equals("Informe sua senha.")) {
            txtSenha.setText("");
            txtSenha.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtSenhaMouseClicked

    private void txtEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnderecoMouseClicked
        if(txtEndereco.getText().equals("Informe seu endereço.")) {
            txtEndereco.setText("");
            txtEndereco.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEnderecoMouseClicked

    private void txtBairroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBairroMouseClicked
       if(txtBairro.getText().equals("Informe o bairro.")) {
            txtBairro.setText("");
            txtBairro.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtBairroMouseClicked

    private void txtCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCidadeMouseClicked
        if(txtCidade.getText().equals("Informe a sua cidade.")) {
            txtCidade.setText("");
            txtCidade.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCidadeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JLabel cadastrar;
    private javax.swing.JPanel cadastrarBtn;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel extBtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imgEsq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numEndereco;
    private javax.swing.JLabel senha;
    private javax.swing.JSeparator separadorCinco;
    private javax.swing.JSeparator separadorDois;
    private javax.swing.JSeparator separadorNove;
    private javax.swing.JSeparator separadorOito;
    private javax.swing.JSeparator separadorQuatro;
    private javax.swing.JSeparator separadorSeis;
    private javax.swing.JSeparator separadorSete;
    private javax.swing.JSeparator separadorTres;
    private javax.swing.JSeparator separadorUm;
    private javax.swing.JLabel telefone;
    private javax.swing.JLabel titulo;
    private javax.swing.JFormattedTextField txfCep;
    private javax.swing.JFormattedTextField txfNumero;
    private javax.swing.JFormattedTextField txfTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
