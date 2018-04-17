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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author neelkapadia
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    public Reports() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Submit = new javax.swing.JButton();
        Occupancy = new javax.swing.JRadioButton();
        TotalOccupancy = new javax.swing.JRadioButton();
        StaffInfo = new javax.swing.JRadioButton();
        Revenue = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RoomCategory = new javax.swing.JRadioButton();
        Date = new javax.swing.JRadioButton();
        City = new javax.swing.JRadioButton();
        Staff = new javax.swing.JRadioButton();
        StaffP = new javax.swing.JRadioButton();
        Home = new javax.swing.JButton();
        Logout1 = new javax.swing.JButton();
        RevenueDate = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        buttonGroup1.add(Occupancy);
        Occupancy.setText("Report occupancy by Hotel");
        Occupancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccupancyActionPerformed(evt);
            }
        });

        buttonGroup1.add(TotalOccupancy);
        TotalOccupancy.setText("Report Total and Percentage Occupancy");
        TotalOccupancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalOccupancyActionPerformed(evt);
            }
        });

        buttonGroup1.add(StaffInfo);
        StaffInfo.setText("Report Staff Info");

        buttonGroup1.add(Revenue);
        Revenue.setText("Report Revenue by Hotel");

        jLabel1.setText("Select the type of report you want to view:");

        jLabel2.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel2.setText("Wolf Inns");

        buttonGroup1.add(RoomCategory);
        RoomCategory.setText("Report occupancy by Room Category");
        RoomCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomCategoryActionPerformed(evt);
            }
        });

        buttonGroup1.add(Date);
        Date.setText("Report occupancy by Date Range");
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        buttonGroup1.add(City);
        City.setText("Report occupancy by City");

        buttonGroup1.add(Staff);
        Staff.setText("Report by Staff Serving Customer");

        buttonGroup1.add(StaffP);
        StaffP.setText("Report by Staff Serving Customer (Presidential Suite)");

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Logout1.setText("Logout");
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RevenueDate);
        RevenueDate.setText("Report Revenue by Date Range");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Staff)
                            .addComponent(Date)
                            .addComponent(RoomCategory)
                            .addComponent(TotalOccupancy)
                            .addComponent(StaffInfo)
                            .addComponent(City)
                            .addComponent(StaffP)
                            .addComponent(Revenue)
                            .addComponent(Occupancy)
                            .addComponent(jLabel1)
                            .addComponent(RevenueDate))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Logout1))))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(Submit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Occupancy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoomCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(City)
                .addGap(2, 2, 2)
                .addComponent(TotalOccupancy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StaffInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Revenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RevenueDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StaffP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Staff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home)
                    .addComponent(Logout1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        db_connection db = new db_connection();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        ResultSet rs1;
        String query;
        String query1;
        try {
            conn = db.connect_db();
            stmt = conn.createStatement();
            if (Occupancy.isSelected()) {
                query = "SELECT x.hotelid, x.rooms_occupied, y.total_rooms FROM (SELECT i.hotelid, count(*) as rooms_occupied FROM isAssigned i GROUP BY i.hotelid) x JOIN (SELECT r.hotelid, count(*) as total_rooms from Room r group by r.hotelid) y ON x.hotelid = y.hotelid;";

                query1 = "Select a.hotelid, a.total_rooms from (select hotelid,count(*) as total_rooms from room group by hotelid)a join (Select hotelid from hotel where hotelid not in (Select hotelid from isassigned))b on a.hotelid = b.hotelid;";

                ReportOccupancyByHotel report = new ReportOccupancyByHotel();
                DefaultTableModel model = (DefaultTableModel) report.Report1.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString("hotelid"), rs.getString("rooms_occupied"), rs.getString("total_rooms")});
                    }

                    rs1 = stmt.executeQuery(query1);

                    while (rs1.next()) {
                        model.addRow(new Object[]{rs1.getString("hotelid"), "0", rs1.getString("total_rooms")});

                    }

                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (TotalOccupancy.isSelected()) {
                query = "SELECT x.hotelid, x.rooms_occupied, y.total_rooms,(x.rooms_occupied/y.total_rooms)*100 as percentage FROM (SELECT i.hotelid, count(*) as rooms_occupied FROM isAssigned i GROUP BY i.hotelid) x JOIN (SELECT r.hotelid, count(*) as total_rooms from Room r group by r.hotelid) y ON x.hotelid = y.hotelid;";
 
                query1 = "Select a.hotelid, a.total_rooms from (select hotelid,count(*) as total_rooms, 0.00 as percentage from room group by hotelid)a join (Select hotelid from hotel where hotelid not in (Select hotelid from isassigned))b on a.hotelid = b.hotelid;";

                ReportTotalOccupancy report = new ReportTotalOccupancy();
                DefaultTableModel model = (DefaultTableModel) report.Total.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString("hotelid"), rs.getString("rooms_occupied"), rs.getString("total_rooms"),rs.getString("percentage")});
                    }
                    
                    rs1 = stmt.executeQuery(query1);

                    while (rs1.next()) {
                        model.addRow(new Object[]{rs1.getString("hotelid"), "0", rs1.getString("total_rooms"),"0.00"});

                    }
                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (StaffInfo.isSelected()) {
                query = "SELECT * FROM Staff ORDER BY jobTitle;";
                ReportByStaffRole report = new ReportByStaffRole();
                DefaultTableModel model = (DefaultTableModel) report.ReportStaffRole.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
                    }
                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (Revenue.isSelected()) {
                query = "select x.hotelid, sum(y.totalamt) as Total_Revenue from (select * from isassigned)x join (select a.invoiceid, bookingid, invoicedate, totalamt from ((select * from generateinvoice)a JOIN (select * from invoice)b on a.invoiceid = b.invoiceid))y on x.bookingid = y.bookingid group by x.hotelid;";
                query1 = "select hotelid from hotel where hotelid NOT IN (select x.hotelid as Total_Revenue from (select * from isassigned)x join (select a.invoiceid, bookingid, invoicedate, totalamt from ((select * from generateinvoice)a JOIN (select * from invoice)b on a.invoiceid = b.invoiceid))y on x.bookingid = y.bookingid);";
                ReportRevenue report = new ReportRevenue();
                DefaultTableModel model = (DefaultTableModel) report.Revenue.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString(1), rs.getString(2)});
                    }
                    rs = stmt.executeQuery(query1);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString(1), 0});
                    }
                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if(RevenueDate.isSelected()){
                DateRangeRevenue drr = new DateRangeRevenue();
                drr.setVisible(true);
            } else if (City.isSelected()) {
                query = "SELECT q.city, p.rooms_occupied, p.total_rooms FROM(SELECT a.hotelid, a.rooms_occupied, a.total_rooms, b.address from (SELECT x.hotelid, x.rooms_occupied, y.total_rooms FROM ( SELECT i.hotelid, count(*) as rooms_occupied FROM isAssigned i GROUP BY i.hotelid) x JOIN (SELECT r.hotelid, count(*) as total_rooms from Room r group by r.hotelid) y ON x.hotelid = y.hotelid) a JOIN (Select hotelid, address from hotel) b ON a.hotelid = b.hotelid) p JOIN (select * from hotelcity) q ON p.address = q.address group by q.city;";
                System.out.println("query: "+query);
                //query1 = "Select city from Hotelcity where city NOT IN (SELECT q.city FROM (SELECT a.hotelid, a.rooms_occupied, a.total_rooms, b.address from (SELECT x.hotelid, x.rooms_occupied, y.total_rooms FROM ( SELECT i.hotelid, count(*) as rooms_occupied FROM isAssigned i GROUP BY i.hotelid) x JOIN (SELECT r.hotelid, count(*) as total_rooms from Room r group by r.hotelid) y ON x.hotelid = y.hotelid) a JOIN (Select hotelid, address from hotel) b ON a.hotelid = b.hotelid) p JOIN (select * from hotelcity) q ON p.address = q.address group by q.city);";
                query1 = "Select x.city as city, y.total as total_rooms from (select city from hotelcity where city not in (SELECT q.city FROM (SELECT a.hotelid, a.rooms_occupied, a.total_rooms, b.address from (SELECT x.hotelid, x.rooms_occupied, y.total_rooms FROM ( SELECT i.hotelid, count(*) as rooms_occupied FROM isAssigned i GROUP BY i.hotelid) x JOIN (SELECT r.hotelid, count(*) as total_rooms from Room r group by r.hotelid) y ON x.hotelid = y.hotelid) a JOIN (Select hotelid, address from hotel) b ON a.hotelid = b.hotelid) p JOIN (select * from hotelcity) q ON p.address = q.address group by q.city))x join (Select a.total,d.city from (select hotelid,count(*) as total from room group by hotelid)a join (select hotelid,city from (select * from hotel)c join (select * from HotelCity)b on c.address = b.address)d on a.hotelid = d.hotelid)y on y.city = x.city group by city;";

                ReportOccupancyByCity report = new ReportOccupancyByCity();
                DefaultTableModel model = (DefaultTableModel) report.ReportCity.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString("city"), rs.getString("rooms_occupied"), rs.getString("total_rooms")});
                    }

                    rs1 = stmt.executeQuery(query1);

                    while (rs1.next()) {
                        model.addRow(new Object[]{rs1.getString("city"), "0", rs1.getString("total_rooms")});

                    }

                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (Date.isSelected()) {
                DateRange dr = new DateRange();
                dr.setVisible(true);
//                query = "select a.occupancy, b.total_rooms from (select x.bookingid as book, count(*) as occupancy from( select bookingId from bookinginfo where DATEDIFF('2018-01-14',enddate) > 0 AND DATEDIFF('2017-05-05',startdate) <= 0) x JOIN (select bookingId, count(*) as room_occupancy from isassigned group by bookingid) y on x.bookingid = y.bookingid) a JOIN (select count(*) as total_rooms from room) b;";
//                ReportOccupancyByDate report = new ReportOccupancyByDate();
//                DefaultTableModel model = (DefaultTableModel) report.ReportDate.getModel();
//                try {
//                    rs = stmt.executeQuery(query);
//                    while (rs.next()) {
//                        //System.out.println("In while");
//                        model.addRow(new Object[]{rs.getString("occupancy"), rs.getString("total_rooms")});
//                    }
//                    report.setVisible(true);
//                } catch (SQLException e) {
//                    JFrame jf = new JFrame();
//                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
//                }
            } else if (RoomCategory.isSelected()) {
                query = "select x.category, rooms_occupied, total_rooms from (select r.category,count(*) as rooms_occupied from room r where r.avail = 0 group by r.category) x JOIN (select r1.category,count(*) as total_rooms from room r1 group by r1.category) y on x.category = y.category;";
                query1 = "select r1.category,count(*) as total_rooms from room r1 where category not in (select x.category from (select r.category,count(*) as rooms_occupied from room r where r.avail = 0 group by r.category) x JOIN (select r1.category,count(*) as total_rooms from room r1 group by r1.category) y on x.category = y.category) group by r1.category;";                
                ReportOccupancyByRoom report = new ReportOccupancyByRoom();
                DefaultTableModel model = (DefaultTableModel) report.ReportRoom.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString("category"), rs.getString("rooms_occupied"), rs.getString("total_rooms")});
                    }
                    rs = stmt.executeQuery(query1);
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("category"), "0", rs.getString("total_rooms")});
                    }
                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (StaffP.isSelected()) {
                query = "Select distinct e.hotelid,e.roomnum,e.staffid as caterer,f.staffid as roomService from (Select c.hotelid,c.roomnum,staffid from (Select hotelid,roomnum FROM (Select * from isAssigned)a join (Select * from gets)b on a.bookingid=b.bookingid)c join (Select * from isAssignedCaterer)d on c.hotelid=d.hotelid and c.roomnum=d.roomnum)e join (Select * from isAssignedRoomService)f on e.hotelid=f.hotelid and e.roomnum=f.roomnum;";
                ReportOccupancyByStaffP report = new ReportOccupancyByStaffP();
                DefaultTableModel model = (DefaultTableModel) report.ReportStaffP.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
                    }
                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (Staff.isSelected()) {
                query = "SELECT DISTINCT e.custid, f.name as Staff_Name, f.jobtitle, f.age, f.phonenum, f.address from (\n"
                        + "SELECT staffid, c.custid from (\n"
                        + "SELECT b.serviceid, a.custid FROM (SELECT * FROM gets) a JOIN (SELECT * FROM linkservice) b ON a.bookingid = b.bookingid) c JOIN (SELECT * from updates) d ON d.serviceid = c.serviceid)e JOIN (SELECT staffid, name, jobTitle, age, phonenum,address from staff) f ON e.staffid = f.staffid;";
                ReportOccupancyByStaff report = new ReportOccupancyByStaff();
                DefaultTableModel model = (DefaultTableModel) report.ReportStaff.getModel();
                try {
                    rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println("In while");
                        model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
                    }
                    report.setVisible(true);
                } catch (SQLException e) {
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No data to show", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JFrame jf = new JFrame();
                JOptionPane.showMessageDialog(jf, "INVALID INPUT", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void TotalOccupancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalOccupancyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalOccupancyActionPerformed

    private void RoomCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomCategoryActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        Manager mng = new Manager();
        sysExit();
        mng.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        sysExit();
        l.setVisible(true);
    }//GEN-LAST:event_Logout1ActionPerformed

    private void OccupancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccupancyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OccupancyActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed
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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton City;
    private javax.swing.JRadioButton Date;
    private javax.swing.JButton Home;
    private javax.swing.JButton Logout1;
    private javax.swing.JRadioButton Occupancy;
    private javax.swing.JRadioButton Revenue;
    private javax.swing.JRadioButton RevenueDate;
    private javax.swing.JRadioButton RoomCategory;
    private javax.swing.JRadioButton Staff;
    private javax.swing.JRadioButton StaffInfo;
    private javax.swing.JRadioButton StaffP;
    private javax.swing.JButton Submit;
    private javax.swing.JRadioButton TotalOccupancy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
