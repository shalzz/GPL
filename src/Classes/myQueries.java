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

import java.sql.Connection;
import java.sql.Statement;
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
            // load the sqlite-JDBC driver using the current class loader
            Class.forName("org.sqlite.JDBC");
            // create a database connection
            Connection con = (Connection) DriverManager.getConnection("jdbc:sqlite:project.db");
            stmt = (Statement) con.createStatement();
            stmt.setQueryTimeout(30);  // set timeout to 30 sec.
            
        }
        catch(Exception e)
          {
                JOptionPane.showMessageDialog (null, e.getMessage());    
          }
        return stmt;
    }
    
    
}
