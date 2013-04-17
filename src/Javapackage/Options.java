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

package Javapackage;

import Classes.md5hash;
import Classes.myQueries;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Options.java
 *
 * Created on Jul 17, 2012, 1:33:24 PM
 */

/**
 *
 * @@author Shaleen,Abhik,Anushree
 */
public class Options extends javax.swing.JFrame {
String username;
    /** Creates new form Options */
    public Options() {
        initComponents();
        
    }
     public Options(String username1) {
         initComponents();
         username = username1;
         try 
         {
             
             String query = "select * from settings;";
             ResultSet rs = myQueries.excQuery(query);
             rs.next();
             int issuetime = rs.getInt("issuetime");
             int fine = rs.getInt("fine");
             int maxbooks = rs.getInt("maxbooks");
             t2.setText("" + fine);
             cb2.setSelectedIndex(maxbooks-1);
             if (issuetime == 1) 
             {
                 cb1.setSelectedIndex(0);                                                    
             } 
             else 
             {
                 cb1.setSelectedIndex(issuetime/7);
             }
         } 
         catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        p5 = new javax.swing.JPasswordField();
        t3 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        p4 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        p3 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        t4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gurgaon Public Library");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 731, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Phone No.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 850, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 691, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 731, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Confim Password");
        jLabel10.setFocusable(false);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, 20));
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 140, -1));
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 691, 165, -1));

        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 850, 165, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 501, -1, 20));
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 140, -1));

        jButton3.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton3.setText("Change Password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel9.setText("Change Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 252, 142, -1));
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 312, 142, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Confim Password");
        jLabel7.setFocusable(false);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("New Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 282, -1, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Old Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 252, -1, -1));
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 282, 142, -1));

        jButton2.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 352, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel3.setText("Change Issuer Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 421, -1, -1));

        jButton5.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 910, -1, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("Username");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 471, -1, -1));

        cb1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Day", "1 Week", "2 Week", "3 Week", "1 Month" }));
        jPanel1.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 100, -1));
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 140, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Max No. of Books that can be issued");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 135, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel15.setText("Change Issuer Info");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 631, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Rs");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Default Issue Time");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 72, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel17.setText("Deactivate Account");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1050, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel4.setText("Options");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 31, 110, -1));

        jButton4.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton4.setText("Create");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 1011, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setText("Fine per Day");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 105, -1, -1));

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 70, -1));

        cb2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        jPanel1.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 100, -1));

        jButton6.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton6.setText("Deactivate account");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1090, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel20.setText("Create a New Admin Account");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 961, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 1140));

        jScrollPane2.setViewportView(jPanel1);

        jMenu4.setText("Home");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-722)/2, 1016, 722);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         signup a= new signup();
        a.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyTyped
       char kc = evt.getKeyChar();
        if(!(kc>='0'&& kc<='9'))
        {
            evt.consume();
        }
        String num=t6.getText();
        if(num.length()>=10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_t6KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String oldpass = new String(p1.getPassword());
      oldpass= md5hash.passwordsalted(oldpass);
      String a= new String (p2.getPassword());
       String b= new String (p3.getPassword());
       String newpass;
       String query;
        try{
              
             query="select password from users where username='"+username+"';";
              ResultSet rs =myQueries.excQuery(query);
              rs.next();
              String BDoldpass=rs.getString("password");
          if(BDoldpass.equals(oldpass))     
          {   if((a.equals(b)))
            { 
            newpass=a;
            newpass=md5hash.passwordsalted(newpass);
            query="update users set password='"+newpass+"' where username='"+username+"'and password='"+oldpass+"'and type='issuer';";
            myQueries.excUpdate(query);
            JOptionPane.showMessageDialog (this,"Password Successfully Changed");
             }
             else
             {
                 JOptionPane.showMessageDialog (this, "Passwords do not match");
             }
         }
          else
          {
              JOptionPane.showMessageDialog (this, "Incorrect Password");
          }
       }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog (this, e.getMessage());
       }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String a= new String (p4.getPassword());
       String b= new String (p5.getPassword());
       String newpass;
       String query=null;
       username=t4.getText();
        try{
              
             if((a.equals(b)))
        { 
            newpass=a;
            newpass=md5hash.passwordsalted(newpass);
            query="update users set password='"+newpass+"' where username='"+username+"'and type='issuer';";
        }
              myQueries.excUpdate(query);
              JOptionPane.showMessageDialog (this,"Password Successfully Changed");
       }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog (this, e.getMessage());
       }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      username=t3.getText();
      String add=ta1.getText();
      String phone=t6.getText();
      try{
              
             String query="update users set address='"+add+"',phoneno='"+phone+"' where username='"+username+"'and type='issuer';";
        
              myQueries.excUpdate(query);
              JOptionPane.showMessageDialog (this,"User Info Successfully Changed");
       }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog (this, e.getMessage());
       }        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int issuetime=0;
       int fine=0;
       int n=0;
       int maxbooks= cb2.getSelectedIndex()+1;
       try
       {
           fine= Integer.parseInt(t2.getText());
       }
       catch(NumberFormatException e)
       {
           n=1;
       }

       if(cb1.getSelectedIndex()==0)
       {
           issuetime=1;
       }
       else
       {
           issuetime=7*cb1.getSelectedIndex();
       }
       if(n==1)
       {
           JOptionPane.showMessageDialog (this,"Please enter the Fine");
       }
       else{
       try{
              
              String query="update settings set fine='"+fine+"',issuetime='"+issuetime+"',maxbooks="+maxbooks+";";
              myQueries.excUpdate(query);
              JOptionPane.showMessageDialog (this,"Settings Changed");
       }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog (this, e.getMessage());
       }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
       char kc = evt.getKeyChar();
        if(!(kc>='0'&& kc<='9'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_t2KeyTyped

    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
       MainPage a = new MainPage(username);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      int r = JOptionPane.showConfirmDialog(this,"Are you sure you want to deactivate your account?", "Alert!", JOptionPane.YES_NO_OPTION);
        try { 
            
            String query="select count(*) from users where type = 'admin'";
            ResultSet rs =myQueries.excQuery(query);  
            rs.next();
            int count =rs.getInt("count(*)");
            if(count>1)    
            {
                if(r==0)
                {
                 query = "Delete from users where username='"+username+"'";
                myQueries.excUpdate(query);  
                JOptionPane.showMessageDialog(this, "Account succesfully Deactivated");
                }
            }else
            {
                JOptionPane.showMessageDialog(this, "Sorry! There has to be one Admin account");
            }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    private javax.swing.JPasswordField p4;
    private javax.swing.JPasswordField p5;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t6;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables

}
