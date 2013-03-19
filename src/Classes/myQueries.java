/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author students
 */
public class myQueries {
    public static Statement getStmt()
    {
        Statement stmt=null;
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root", "DPS");
            stmt = (Statement) con.createStatement();
            
        }
        catch(Exception e)
          {
                JOptionPane.showMessageDialog (null, e.getMessage());    
          }
        return stmt;
    }
    
    
}
