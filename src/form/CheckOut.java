/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rohitnaik
 */
public class CheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CheckOut
     */
    public CheckOut() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel1.setText("Wolf Inns");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel2.setText("Wolf Inns");

        jLabel3.setText("Room Number");

        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(submit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home)
                    .addComponent(Logout)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        db_connection db = new db_connection();
        Connection conn = null;
        ResultSet rs;
        Statement stmt = null;
        
        try {
            conn = db.connect_db();
            stmt = conn.createStatement();
            
            conn.setAutoCommit(false);
            
            // get hotel id of the front desk staff
            String getHotelId = "SELECT hotelid FROM worksFor WHERE staffid='"+Intermediate.getItem("frontDeskStaffId")+"'";
            rs = stmt.executeQuery(getHotelId);
            rs.next();
            int hotelId = Integer.parseInt(rs.getString("hotelid"));
            int roomNo = Integer.parseInt(room.getText());
            
            String getBookingId = "SELECT bookingid FROM isAssigned WHERE hotelid="+hotelId+" AND roomnum="+roomNo;
            rs = stmt.executeQuery(getBookingId);
            rs.next();
            int bookingId = Integer.parseInt(rs.getString("bookingid"));
                        
            String deleteIsAssigned = "DELETE FROM isAssigned WHERE hotelid="+hotelId+" AND roomnum="+roomNo;
            stmt.executeUpdate(deleteIsAssigned);
            
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String checkoutTime = sdf.format(cal.getTime());
            
            // Update checkout time in bookinginfo
            String checkoutUpdate = "UPDATE BookingInfo SET checkout='"+checkoutTime+"' WHERE bookingid="+bookingId;
            stmt.executeUpdate(checkoutUpdate);
            
            // Toggle availability of room
            String roomAvailabilityToggle = "UPDATE Room SET avail=1 WHERE hotelid="+hotelId+" AND roomnum="+roomNo;
            stmt.executeUpdate(roomAvailabilityToggle);
            
            // Check if presidential suite
            String ifPresidentialSuite = "SELECT * FROM PresidentialSuite WHERE hotelid="+hotelId+" AND roomnum="+roomNo;
            rs = stmt.executeQuery(ifPresidentialSuite);
            // If Presidential Suite
            if(rs.next()){
                // Get staffid of caterer
                String getCaterer = "SELECT staffid FROM isAssignedCaterer WHERE hotelid="+hotelId+" AND roomnum="+roomNo;
                rs = stmt.executeQuery(getCaterer);
                rs.next();
                int catererId = Integer.parseInt(rs.getString("staffid"));
                // Delete from isAssignedCaterer
                String deleteCaterer = "DELETE FROM isAssignedCaterer WHERE staffid="+catererId+" AND hotelid="+hotelId+" AND roomnum="+roomNo;
                stmt.executeUpdate(deleteCaterer);
                // Toggle availability from Caterer
                String catererToggle = "UPDATE Staff SET avail=1 WHERE staffid="+catererId;
                stmt.executeUpdate(catererToggle);
                
                // Get staffid of room service
                String getRoomService = "SELECT staffid FROM isAssignedRoomService WHERE hotelid="+hotelId+" AND roomnum="+roomNo;
                rs = stmt.executeQuery(getRoomService);
                rs.next();
                int roomServiceId = Integer.parseInt(rs.getString("staffid"));
                // Delete from isAssignedRoomService
                String deleteRoomService = "DELETE FROM isAssignedRoomService WHERE staffid="+roomServiceId+" AND hotelid="+hotelId+" AND roomnum="+roomNo;
                stmt.executeUpdate(deleteRoomService);
                // Toogle availability from RoomService
                String roomServiceToggle = "UPDATE Staff SET avail=1 WHERE staffid="+roomServiceId;
                stmt.executeUpdate(roomServiceToggle);
            }
            
            // At the end. Success!
            conn.commit();
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf, "Successfully checked out!", "CONFIRMATION", JOptionPane.INFORMATION_MESSAGE);
            
            FrontDesk fd = new FrontDesk();
            sysExit();
            fd.setVisible(true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf, "Error in insertions after checkin", "ERROR", JOptionPane.ERROR_MESSAGE);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        finally{
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        FrontDesk fd = new FrontDesk();
        sysExit();
        fd.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        sysExit();
        l.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed
    
    public void sysExit() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField room;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
