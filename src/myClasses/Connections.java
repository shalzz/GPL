/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author 500029490
 */
public class Connections {
    
  final static Logger logger = LoggerFactory.getLogger(Connections.class);
    
  public static Statement mySqlStmt(String url,String username,String password)  {
      Statement stmt=null;
      try 
      {
          Class.forName("java.sql.DriverManager");
          Connection con = (Connection) DriverManager.getConnection(url, username, password);
          stmt = (Statement) con.createStatement();

      }
      catch (Exception e)
      {
          logger.error("Error Description:", e);
      }
      return stmt;
  }
    
    public static java.sql.Statement sqlLiteStmt(String url)  {
        java.sql.Statement stmt = null;
        try
        {
            // load the sqlite-JDBC driver using the current class loader
            Class.forName("org.sqlite.JDBC");
            // create a database connection
            java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection(url);
            stmt = (java.sql.Statement) con.createStatement();
            stmt.setQueryTimeout(30);  // set timeout to 30 sec.

        } 
        catch (Exception e) 
        {
            logger.error("Error Description:", e);
        }
        return stmt;
    }
}
