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
 * OptionsIssuer.java
 *
 * Created on Jul 19, 2012, 8:29:01 PM
 */
package Javapackage;

import myClasses.Md5Hash;
import myClasses.MyQueries;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Shaleen
 */
public class OptionsIssuer extends javax.swing.JFrame {
  
    String username;
    final static Logger logger = LoggerFactory.getLogger(OptionsIssuer.class);

    /** Creates new form OptionsIssuer */
    public OptionsIssuer() {
        initComponents();
        
    }
    
    public OptionsIssuer(String username1) {
        username=username1;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p3 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gurgaon Public Library");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel2.setText("Update Info");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 213, -1, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 183, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Old Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Confim Password");
        jLabel5.setFocusable(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 132, -1, -1));
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 133, 162, -1));
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 102, 162, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("New Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 100, -1, 20));
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 162, -1));

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 273, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 273, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 393, -1, -1));

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 394, 166, -1));

        cb1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb1.setText("I agree to the Terms and Conditions");
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 485, -1, -1));

        cb2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb2.setText("I declare that all info provided here is Correct");
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 515, -1, -1));

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton3.setText("Read Terms and Conditions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 485, -1, -1));

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 565, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        jMenu3.setText("Home");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-682)/2, 1016, 682);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String oldpass = new String(p1.getPassword());
      oldpass= Md5Hash.passwordsalted(oldpass);
      String a= new String (p2.getPassword());
       String b= new String (p3.getPassword());
       String newpass;
       String query;
   try{
              
              query="select password from users where username='"+username+"';";
              ResultSet rs =MyQueries.excQuery(query);
              rs.next();
              String BDoldpass=rs.getString("password");
              myClasses.Connections.close(); // Close connection to prevent Database lock
     if(!(oldpass.isEmpty()&&a.isEmpty()&&b.isEmpty()))
     {
         if(BDoldpass.equals(oldpass))     
          {   if((a.equals(b)))
            { 
            newpass=a;
            newpass=Md5Hash.passwordsalted(newpass);
            query="update users set password='"+newpass+"' where username='"+username+"'and password='"+oldpass+"'and type='issuer';";
            MyQueries.excUpdate(query);
            myClasses.Connections.close(); // Close connection to prevent Database lock
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
      }else
     {
         JOptionPane.showMessageDialog (this, "Please enter the details");
     }
   }
      catch(Exception e)
      {
         logger.error("Error Description:", e);
       }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
      char kc = evt.getKeyChar();
        if(!(kc>='0'&& kc<='9'))
        {
            evt.consume();
        }
        String num=t3.getText();
        if(num.length()>=10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_t3KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
TnC a = new TnC();  
 a.setVisible(true);         
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String add=ta1.getText();
        String phone=t3.getText();
        
        if(username.isEmpty())
        {JOptionPane.showMessageDialog (this, "Please enter your Username");}
        
        else if(add.isEmpty())
        {JOptionPane.showMessageDialog (this, "Please enter your address");}
         
        else if(phone.isEmpty())
        {JOptionPane.showMessageDialog (this, "Please enter your Phone Number");}
        
        else if(cb1.isSelected()==false)
        {JOptionPane.showMessageDialog (this, "Please Select Terms and Conditions");}
        
        else if(cb2.isSelected()==false)
        {JOptionPane.showMessageDialog (this, "Please acknowldge the information is correct");}
        
        else{
        try{
            
            String query="update users set address='"+add+"' ,phoneno="+phone+" where username='"+username+"';";

            MyQueries.excUpdate(query);
            myClasses.Connections.close(); // Close connection to prevent Database lock
            JOptionPane.showMessageDialog (this,"Information added");
        }
        catch(Exception e)
        {
            logger.error("Error Description:", e);
        }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        MainPageissuer a = new MainPageissuer(username);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MousePressed

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
            java.util.logging.Logger.getLogger(OptionsIssuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsIssuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsIssuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsIssuer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OptionsIssuer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    private javax.swing.JTextField t3;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
