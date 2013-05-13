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
package Classes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;

/**
 *
 * @author students
 */
public class myQueries {

    static final Preferences prefs = Preferences.systemRoot().node("/Javapackage");
    private static final String DBMS_TYPE = "DbmsType";
    private static final String Dbmstype = prefs.get(DBMS_TYPE, "sqlite");
    private static final String SERVER_URL = "serverURL";
    private static final String serverurl = prefs.get(SERVER_URL, null);
    private static final String DB_NAME = "DatabaseName";
    private static final String dbname = prefs.get(DB_NAME, "project");

    public static void excUpdate(String query) {
        if (Dbmstype.equals("mysql")) {
            try {
                int i = serverurl.indexOf(',');
                String url = serverurl.substring(0, i);
                int j = serverurl.indexOf(',', i + 1);
                String username = serverurl.substring(i, j);
                String password = serverurl.substring(j);
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection) DriverManager.getConnection(url, username, password);
                Statement stmt = (Statement) con.createStatement();
                stmt.executeUpdate(query);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            try {
                // load the sqlite-JDBC driver using the current class loader
                Class.forName("org.sqlite.JDBC");
                // create a database connection                
                java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection("jdbc:sqlite:databases\\" + dbname + ".db");
                java.sql.Statement stmt1 = (java.sql.Statement) con.createStatement();
                stmt1.setQueryTimeout(30);  // set timeout to 30 sec.
                stmt1.executeUpdate(query);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public static ResultSet excQuery(String query) {

        ResultSet rs = null;
        if (Dbmstype.equals("mysql")) {
            try {
                Statement stmt;
                int i = serverurl.indexOf(',');
                String url = serverurl.substring(0, i);
                int j = serverurl.indexOf(',', i + 1);
                String username = serverurl.substring(i, j);
                String password = serverurl.substring(j);
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection) DriverManager.getConnection(url, username, password);
                stmt = (Statement) con.createStatement();
                rs = stmt.executeQuery(query);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            java.sql.Statement stmt1;
            try {
                // load the sqlite-JDBC driver using the current class loader
                Class.forName("org.sqlite.JDBC");
                // create a database connection
                java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection("jdbc:sqlite:databases\\" + dbname + ".db");
                stmt1 = (java.sql.Statement) con.createStatement();
                stmt1.setQueryTimeout(30);  // set timeout to 30 sec.
                rs = stmt1.executeQuery(query);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return rs;
    }
}
