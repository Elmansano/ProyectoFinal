/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo
 */
public class Login_1 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login_1() {
        initComponents();
        //Centra la ventana
        this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jpassContraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jtxtEntrar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jtxtComprador = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("INICIAR SESION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jtxtUsuario.setBorder(null);
        jtxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 400, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 400, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 400, -1));

        jpassContraseña.setToolTipText("********");
        jpassContraseña.setBorder(null);
        jpassContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpassContraseñaMousePressed(evt);
            }
        });
        jpassContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jpassContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 400, 30));

        jtxtEntrar.setBackground(new java.awt.Color(0, 102, 255));
        jtxtEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEntrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtEntrar.setText("ENTRAR");
        jtxtEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtxtEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtEntrarMouseClicked(evt);
            }
        });
        jtxtEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtxtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jtxtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 40));

        jtxtComprador.setBackground(new java.awt.Color(255, 51, 102));
        jtxtComprador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtComprador.setForeground(new java.awt.Color(255, 255, 255));
        jtxtComprador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtComprador.setText("COMPRADOR");
        jtxtComprador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtxtComprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCompradorMouseClicked(evt);
            }
        });
        jtxtComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCompradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtxtComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtxtComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 260, 450));

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

    private void jtxtEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEntrarActionPerformed
        
    }//GEN-LAST:event_jtxtEntrarActionPerformed

    private void jtxtCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCompradorActionPerformed

    private void jtxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuarioMousePressed
          
    }//GEN-LAST:event_jtxtUsuarioMousePressed

    private void jpassContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpassContraseñaMousePressed
        
    }//GEN-LAST:event_jpassContraseñaMousePressed

    private void jpassContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassContraseñaActionPerformed

    private void jtxtEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtEntrarMouseClicked
        //Usuario y contraseña para modo administrador
        String Usuario="admin";
        String Contraseña="123";
        //
        //Obtiene lo q se digite en el campo contraseña
        String Password=new String(jpassContraseña.getPassword());
        //
        //if para ingresar al modo administrador
        if (jtxtUsuario.getText().equalsIgnoreCase(Usuario)&& Password.equals(Contraseña)) {
            //Dirige a la ventana Administrador
            Administrador newframe=new Administrador();
            newframe.setVisible(true);
            this.dispose();
        }else{
            //ventana por si la contraseña o usuario es incorrecta
            JOptionPane.showMessageDialog(this, "Usuario/Contraseña incorrecta");
        }
    }//GEN-LAST:event_jtxtEntrarMouseClicked

    private void jtxtCompradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCompradorMouseClicked
            //Dirige a la ventana Comprador
            Comprador newframe=new Comprador();
            newframe.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jtxtCompradorMouseClicked

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
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpassContraseña;
    private javax.swing.JTextField jtxtComprador;
    private javax.swing.JTextField jtxtEntrar;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}