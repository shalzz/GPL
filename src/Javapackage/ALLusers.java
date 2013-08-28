/*
     GPL(GNU Public Library) is a Library Management System.
    Copyright (C) 2012-2013  Shaleen Jain

    This file is part of GPL.

    GPL is a free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * ALLusers.java
 *
 * Created on Oct 7, 2012, 5:23:26 PM
 */
package Javapackage;

import myClasses.MyQueries;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Shaleen
 */
public class ALLusers extends javax.swing.JFrame {

    String username;
    final static Logger logger = LoggerFactory.getLogger(ALLusers.class);

    /** Creates new form ALLusers */
    public ALLusers() {
        initComponents();

    }

    public ALLusers(String username1) {
        initComponents();
        username = username1;
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        try {

            
            String query = "SELECT issuerid,username,type,fname FROM users order by fname;";
            ResultSet rs = MyQueries.excQuery(query);
            model1.setRowCount(0);
            while (rs.next()) 
            {
                String fname = rs.getString("fname");
                model1.addRow(new Object[]{fname});
            }
        }
        catch (Exception e) 
        {
            logger.error("Error Description:", e);
        }
        myClasses.Connections.close(); // Close connection to prevent Database lock
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t6 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gurgaon Public Library");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "First Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 0, 198, 590));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Second Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Phone No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("User Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Issuer ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        t7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 110, 20));

        t4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 110, 20));

        t3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 110, 20));

        t1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 110, 20));

        t2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 110, 20));

        t8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 110, 20));

        t5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 110, 20));

        t6.setEditable(false);
        t6.setColumns(20);
        t6.setLineWrap(true);
        t6.setRows(5);
        t6.setWrapStyleWord(true);
        jScrollPane3.setViewportView(t6);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, 110));

        jButton1.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton1.setText("Delete User account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-648)/2, 1016, 648);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
       DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        String fname = (String) model1.getValueAt(row, 0);
        if (!(row == -1)) 
        {
            try 
            {
                
                String query = "SELECT * FROM users where fname ='" + fname + "';";
                ResultSet rs = MyQueries.excQuery(query);
                rs.next();

                int issuerid = rs.getInt("issuerid");
                String username1 = rs.getString("username");
                String lname = rs.getString("lname");
                String add = rs.getString("address");
                String gender = rs.getString("gender");
                Long phoneno = rs.getLong("phoneno");
                String type = rs.getString("type");
                t1.setText(issuerid + "");
                t2.setText(username1);
                t3.setText(fname);
                t4.setText(lname);
                t6.setText(add);
                t5.setText(gender);
                t7.setText(phoneno + "");
                t8.setText(type);


            }
            catch (Exception e)
            {
                logger.error("Error Description:", e);
            }
            myClasses.Connections.close(); // Close connection to prevent Database lock
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        MainPage a = new MainPage(username);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
      String username1=t2.getText();
      int r = JOptionPane.showConfirmDialog(this,"Are you sure you want to Delete this user account?", "Alert!", JOptionPane.YES_NO_OPTION);
      try 
            {
                if(r==0)
                {
                
                String query = "Delete from users where username='"+username1+"'and type= 'issuer';";
                MyQueries.excUpdate(query);  
                JOptionPane.showMessageDialog(this, "Account succesfully deleted");
                model1.removeRow(jTable1.getSelectedRow());
                }
            }
            catch (Exception e)
            {
                logger.error("Error Description:", e);
            }
       myClasses.Connections.close(); // Close connection to prevent Database lock
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
       DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        String fname = (String) model1.getValueAt(row, 0);
        if (!(row == -1)) 
        {
            try 
            {
                
                String query = "SELECT * FROM users where fname ='" + fname + "';";
                ResultSet rs = MyQueries.excQuery(query);
                rs.next();

                int issuerid = rs.getInt("issuerid");
                String username1 = rs.getString("username");
                String lname = rs.getString("lname");
                String add = rs.getString("address");
                String gender = rs.getString("gender");
                Long phoneno = rs.getLong("phoneno");
                String type = rs.getString("type");
                t1.setText(issuerid + "");
                t2.setText(username1);
                t3.setText(fname);
                t4.setText(lname);
                t6.setText(add);
                t5.setText(gender);
                t7.setText(phoneno + "");
                t8.setText(type);


            }
            catch (Exception e)
            {
                logger.error("Error Description:", e);
            }
         myClasses.Connections.close(); // Close connection to prevent Database lock   
        }
    }//GEN-LAST:event_jTable1KeyPressed

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
            java.util.logging.Logger.getLogger(ALLusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALLusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALLusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALLusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ALLusers().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JTextArea t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    // End of variables declaration//GEN-END:variables
}
