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
 * MainPageissuer.java
 *
 * Created on Jul 19, 2012, 8:50:11 AM
 */
package Javapackage;

import myClasses.MyQueries;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Shaleen
 */
public class MainPageissuer extends javax.swing.JFrame {

    String username1;
    final static Logger logger = LoggerFactory.getLogger(MainPageissuer.class);

    /** Creates new form MainPageissuer */
    public MainPageissuer() {
        initComponents();
    }

    public MainPageissuer(String username) {
        initComponents();
        username1 = username;
        l1.setText(username1);
        jScrollPane2.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gurgaon Public Library");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Century Gothic", 2, 12));
        jButton1.setText("Show Issued Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book Code", "Book Name", "Issue Date", "Return Date", "Fine Due"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 1000, 220));

        jButton2.setFont(new java.awt.Font("Century Gothic", 2, 12));
        jButton2.setText("Issue Book");
        jButton2.setToolTipText("Click to issue the selected book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jButton3.setFont(new java.awt.Font("Century Gothic", 2, 12));
        jButton3.setText("View all Books");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 130, -1));

        l1.setFont(new java.awt.Font("Century Gothic", 1, 14));
        l1.setText("Welcome!");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 90, -1));

        l2.setFont(new java.awt.Font("Century Gothic", 2, 14));
        l2.setText("Welcome!");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 70, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 20));
        jLabel1.setText("Search book By");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel5.setText("Book Code");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel6.setText("Book Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel7.setText("Book author");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel2.setText("Genre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        t5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t5CaretUpdate(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 70, -1));

        t6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t6CaretUpdate(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 70, -1));

        t7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t7CaretUpdate(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 80, -1));

        t8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t8CaretUpdate(evt);
            }
        });
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 90, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Code", "Book Name", "Author", "Genre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 367, 1000, 230));

        jButton4.setFont(new java.awt.Font("Century Gothic", 2, 12));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jButton5.setFont(new java.awt.Font("Century Gothic", 2, 12));
        jButton5.setText("View Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        jMenu3.setText("Options");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Log Out");
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jScrollPane1.setVisible(true);
        jScrollPane2.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int FineDue = 0;
        int fine;

        try {
            
            String query = "select fine from settings;";
            ResultSet rs0 = MyQueries.excQuery(query);
            rs0.next();
            fine = rs0.getInt("fine");
            myClasses.Connections.close(); // Close connection to prevent Database lock
            query = "SELECT * FROM accounts where username='" + username1 + "';";
            ResultSet rs = MyQueries.excQuery(query);
            model.setRowCount(0);
            while (rs.next())
            {
                int Bookid = rs.getInt("Bookcode");
                String Bookname = rs.getString("Bookname");
                Date iDate = rs.getDate("issueDate");
                Date rDate = rs.getDate("ReturnDate");
                Calendar issueDate = Calendar.getInstance();
                issueDate.setTime(iDate);
                Calendar returnDate = Calendar.getInstance();
                returnDate.setTime(rDate);
                Calendar curdate = Calendar.getInstance();
                if (curdate.after(returnDate))
                {
                    while (curdate.after(returnDate)) 
                    {
                        returnDate.add(Calendar.DAY_OF_MONTH, 1);
                        FineDue++;
                    }
                    returnDate.add(Calendar.DAY_OF_MONTH, -FineDue);
                    FineDue = (FineDue - 1) * fine;

                }
                int iyear = issueDate.get(Calendar.YEAR);
                int imonth = issueDate.get(Calendar.MONTH) + 1;
                int idayOfMonth = issueDate.get(Calendar.DAY_OF_MONTH);
                String idate = "" + iyear + "/" + imonth + "/" + idayOfMonth;
                int ryear = returnDate.get(Calendar.YEAR);
                int rmonth = returnDate.get(Calendar.MONTH) + 1;
                int rdayOfMonth = returnDate.get(Calendar.DAY_OF_MONTH);
                String rdate = "" + ryear + "/" + rmonth + "/" + rdayOfMonth;
                model.addRow(new Object[]{Bookid, Bookname, idate, rdate, FineDue});
                FineDue = 0;
            }
            myClasses.Connections.close(); // Close connection to prevent Database lock
        } 
        catch (Exception e) 
        {
            logger.error("Error Description:", e);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        int bookcode = 0;
        int n = 0;
        String bookname = null;
        String query;
        int issuerid;
        int count;
        int row = jTable2.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please Select a Book");
        } else {
            bookcode = (Integer) model1.getValueAt(row, 0);
            bookname = (String) model1.getValueAt(row, 1);
        }

        if (row != -1) {
            try {
                
                query = "select username,issuerid from users where username = '" + username1 + "';";
                ResultSet rs1 = MyQueries.excQuery(query);
                rs1.next();
                username1 = rs1.getString("username");
                issuerid = rs1.getInt("issuerid");
                myClasses.Connections.close(); // Close connection to prevent Database lock
                
                query = "select count(*) from accounts where username = '" + username1 + "';";
                ResultSet rs2 = MyQueries.excQuery(query);
                rs2.next();
                count = rs2.getInt("count(*)");
                myClasses.Connections.close(); // Close connection to prevent Database lock
                
                query = "select * from settings;";
                ResultSet rs3 = MyQueries.excQuery(query);
                rs3.next();
                int issuetime = rs3.getInt("issuetime");
                int maxbooks = rs3.getInt("maxbooks");
                myClasses.Connections.close(); // Close connection to prevent Database lock

                if (count >= maxbooks) 
                {
                    JOptionPane.showMessageDialog(this, "Sorry! You cannot Issue more than " + maxbooks + " books");
                } 
                else 
                {
                    Calendar curdate = Calendar.getInstance();
                    Calendar returndate;
                    curdate.add(Calendar.DAY_OF_MONTH, issuetime);
                    returndate = curdate;
                    curdate = Calendar.getInstance();
                    int iyear = curdate.get(Calendar.YEAR);
                    int imonth = curdate.get(Calendar.MONTH) + 1;
                    int idayOfMonth = curdate.get(Calendar.DAY_OF_MONTH);
                    int ryear = returndate.get(Calendar.YEAR);
                    int rmonth = returndate.get(Calendar.MONTH) + 1;
                    int rdayOfMonth = returndate.get(Calendar.DAY_OF_MONTH);
                    String idate = "" + iyear + "/" + imonth + "/" + idayOfMonth;
                    String rdate = "" + ryear + "/" + rmonth + "/" + rdayOfMonth;
                    query = "insert into accounts values(" + issuerid + ",'" + username1 + "'," + bookcode + ",'" + bookname + "','" + idate + "','" + rdate + "');";
                    MyQueries.excUpdate(query);
                    myClasses.Connections.close(); // Close connection to prevent Database lock
                    JOptionPane.showMessageDialog(this, "Book Succesfully issued");
                }
            } 
            catch (Exception f) 
            {
                if (f.getMessage().equals("Duplicate entry '" + bookcode + "' for key 'PRIMARY'")) 
                {
                    JOptionPane.showMessageDialog(this, "This book has already been issued by you or someone else");
                } 
                else
                {
                    JOptionPane.showMessageDialog(this, f.getMessage());
                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(true);
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        try {
            
            String query = "SELECT * FROM books;";
            ResultSet rs = MyQueries.excQuery(query);
            model1.setRowCount(0);
            while (rs.next()) 
            {
                int Bookid = rs.getInt("Bookcode");
                String Bookname = rs.getString("Bookname");
                String author = rs.getString("author");
                String genre = rs.getString("genre");
                model1.addRow(new Object[]{Bookid, Bookname, author, genre});
            }
            myClasses.Connections.close(); // Close connection to prevent Database lock
        }
        catch (Exception e) 
        {
            logger.error("Error Description:", e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t5CaretUpdate
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(true);
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        int bookcode = 0;
        int n = 0;
        String query;
        try
        {
            bookcode = Integer.parseInt(t5.getText());
        }
        catch (NumberFormatException e) 
        {
            n = 1;
        }

        try {           
            if (!(n == 1)) 
            {
                query = "SELECT * FROM books where bookcode like '" + bookcode + "%';";
                ResultSet rs = MyQueries.excQuery(query);
                model1.setRowCount(0);
                while (rs.next()) 
                {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model1.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            } 
            else 
            {
                query = "SELECT * FROM books;";
                ResultSet rs = MyQueries.excQuery(query);
                model1.setRowCount(0);
                while (rs.next()) 
                {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model1.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            }
        } 
        catch (Exception e) 
        {
            logger.error("Error Description:", e);
        }
    }//GEN-LAST:event_t5CaretUpdate

    private void t6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t6CaretUpdate
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(true);
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        String bookname = t6.getText();
        String query;
        try {
            
            if (!(bookname.isEmpty())) 
            {
                query = "SELECT * FROM books where bookname like '" + bookname + "%';";
                ResultSet rs = MyQueries.excQuery(query);
                model1.setRowCount(0);
                while (rs.next()) {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model1.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            }
            else
            {
                query = "SELECT * FROM books;";
                ResultSet rs = MyQueries.excQuery(query);
                model1.setRowCount(0);
                while (rs.next())
                {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model1.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            }
        } catch (Exception e) {
            logger.error("Error Description:", e);
        }
    }//GEN-LAST:event_t6CaretUpdate

    private void t7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t7CaretUpdate
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(true);
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        String author1 = t7.getText();
        String query;
        try {
            
            if (!(author1.isEmpty())) 
            {
                query = "SELECT * FROM books where author like '" + author1 + "%';";
                ResultSet rs = MyQueries.excQuery(query);
                model1.setRowCount(0);
                while (rs.next()) 
                {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model1.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            }
            else
            {
                query = "SELECT * FROM books;";
                ResultSet rs = MyQueries.excQuery(query);
                model1.setRowCount(0);
                while (rs.next()) 
                {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model1.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            }
        } 
        catch (Exception e) 
        {
            logger.error("Error Description:", e);
        }
    }//GEN-LAST:event_t7CaretUpdate

    private void t8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t8CaretUpdate
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String genre1 = t8.getText();
        String query;
        try {
            
            if (!(genre1.isEmpty()))
            {
                query = "SELECT * FROM books where genre like '" + genre1 + "%';";
                ResultSet rs = MyQueries.excQuery(query);
                model.setRowCount(0);
                while (rs.next())
                {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            } 
            else 
            {
                query = "SELECT * FROM books;";
                ResultSet rs = MyQueries.excQuery(query);
                model.setRowCount(0);
                while (rs.next()) 
                {
                    int Bookid = rs.getInt("Bookcode");
                    String Bookname = rs.getString("Bookname");
                    String author = rs.getString("author");
                    String genre = rs.getString("genre");
                    model.addRow(new Object[]{Bookid, Bookname, author, genre});
                }
                myClasses.Connections.close(); // Close connection to prevent Database lock
            }
        } 
        catch (Exception e) 
        {
            logger.error("Error Description:", e);
        }
    }//GEN-LAST:event_t8CaretUpdate

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable2.getSelectedRow();
        int row1 = jTable1.getSelectedRow();
        int bookcode;
        if (row == -1) 
        {
            if (row1 == -1)
            {
                JOptionPane.showMessageDialog(this, "Please Select a Book");
            } 
            else 
            {
                bookcode = (Integer) model.getValueAt(row1, 0);
                bookDetails a = new bookDetails(bookcode);
                a.setVisible(true);
                row1 =-1;
            }
        }
        else 
        {
            bookcode = (Integer) model1.getValueAt(row, 0);
            bookDetails a = new bookDetails(bookcode);
            a.setVisible(true);
            row= -1;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        OptionsIssuer a = new OptionsIssuer(username1);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        StartPage a = new StartPage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainPageissuer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    // End of variables declaration//GEN-END:variables
}
