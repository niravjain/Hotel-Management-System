/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wolfinn;

import wolfinn.Manager;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
/**
 *
 * @author saurabhshanbhag
 */
public class Login extends javax.swing.JFrame {

     
    /**
     * Creates new form WolfInnApp
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        Login_button = new javax.swing.JButton();
        StaffID_label = new javax.swing.JLabel();
        StaffID_text = new javax.swing.JTextField();
        Password_label = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel1.setText("Wolf Inns");

        Login_button.setText("Login");
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });

        StaffID_label.setText("Staff ID");

        StaffID_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffID_textActionPerformed(evt);
            }
        });

        Password_label.setText("Password");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(Login_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_label)
                            .addComponent(StaffID_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(StaffID_text))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StaffID_label)
                    .addComponent(StaffID_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_label)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(Login_button)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        // TODO add your handling code here:
        //JFrame jf = new JFrame();
        
        //check the kind of staff the user id belongs to
        Manager mng = new Manager();
        FrontDesk fd = new FrontDesk();
        ServiceRecords sr = new ServiceRecords();
        
        String pwd = password.getText();
        String sid = StaffID_text.getText();
        
        if(sid.equals("100") && pwd.equals("mary123")){
            sysExit();
            //if sid belongs to manager)
                mng.setVisible(true);
            //if sid belongs to front desk
                fd.setVisible(true);
            //if sid belongs to others
                sr.setVisible(true);
        }
        
        else if(sid.equals("106") && pwd.equals("olivia123")){
            sysExit();
            fd.setVisible(true);
            
        } 
        else{
            JOptionPane.showMessageDialog(null,"INVALID LOGIN DETAILS","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            password.setText(null);
            StaffID_text.setText(null);
            
        }
        
    }//GEN-LAST:event_Login_buttonActionPerformed
    private void connect_db(){
        
    }
    private void StaffID_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffID_textActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_StaffID_textActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void sysExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_button;
    private javax.swing.JLabel Password_label;
    private javax.swing.JLabel StaffID_label;
    private javax.swing.JTextField StaffID_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
