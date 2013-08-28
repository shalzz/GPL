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
package myClasses;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author students
 */
public class MyQueries {

    static final Preferences prefs = Preferences.userRoot().node("/Javapackage");
    private static final String DBMS_TYPE = "DbmsType";
    private static final String Dbmstype = prefs.get(DBMS_TYPE, "sqlite");
    private static final String SERVER_URL = "serverURL";
    private static final String serverurl = prefs.get(SERVER_URL, null);
    private static final String DB_NAME = "DatabaseName";
    private static final String dbname = prefs.get(DB_NAME, "project");
    final static Logger logger = LoggerFactory.getLogger(MyQueries.class);

    public static void excUpdate(String query) {
        if (Dbmstype.equals("mysql"))
        {
            try 
            {
                int i = serverurl.indexOf(',');
                String url = serverurl.substring(0, i);
                int j = serverurl.indexOf(',', i + 1);
                String username = serverurl.substring(i+1, j);
                String password = serverurl.substring(j+1);
                
                Statement stmt = Connections.mySqlStmt(url, username, password);
                stmt.executeUpdate(query);

            } catch (Exception e) {
                 logger.error("Error Description:", e);
            }
        } 
        else
        {
            try
            {
                String url="jdbc:sqlite:databases/" + dbname + ".db";
                java.sql.Statement stmt=Connections.sqlLiteStmt(url);
                stmt.executeUpdate(query);

            } catch (Exception e) {
                logger.error("Error Description:", e);
            }
        }
    }

    public static ResultSet excQuery(String query) {

        ResultSet rs = null;
        if (Dbmstype.equals("mysql")) 
        {
            try
            {
                int i = serverurl.indexOf(',');
                String url = serverurl.substring(0, i);
                int j = serverurl.indexOf(',', i + 1);
                String username = serverurl.substring(i+1, j);
                String password = serverurl.substring(j+1);
                
                Statement stmt = Connections.mySqlStmt(url, username, password);
                rs = stmt.executeQuery(query);

            } 
            catch (Exception e)
            {
                 logger.error("Error Description:", e);
            }
        } 
        else 
        {
            try
            {
                String url="jdbc:sqlite:databases/" + dbname + ".db";
                java.sql.Statement stmt=Connections.sqlLiteStmt(url);
                rs = stmt.executeQuery(query);

            } 
            catch (Exception e)
            {
                 logger.error("Error Description:", e);
            }
        }
        return rs;
    }
}
