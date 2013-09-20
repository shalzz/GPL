/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

import Javapackage.MainPage;
import java.sql.ResultSet;
import java.util.Calendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author 500029490
 */
public class MyDate {
    final static Logger logger = LoggerFactory.getLogger(MainPage.class);
    
    public static String issueDate(){
        Calendar curdate;
        curdate = Calendar.getInstance();
        int iyear = curdate.get(Calendar.YEAR);
        int imonth = curdate.get(Calendar.MONTH) + 1;
        int idayOfMonth = curdate.get(Calendar.DAY_OF_MONTH);
        String idate = "" + iyear + "-" + imonth + "-" + idayOfMonth;
        return idate;
    }
    
    public static String returnDate() {
        int issuetime=0;
        try{
        String query = "select * from settings;";
        ResultSet rs3 = MyQueries.excQuery(query);
        rs3.next();
        issuetime = rs3.getInt("issuetime");
        }
        catch(Exception e)  
        {
            logger.error("Error Description:",e);
        }
        finally
        {
            myClasses.Connections.close(); // Close connection to prevent Database lock
        }
                
        Calendar curdate;
        curdate = Calendar.getInstance();
        Calendar returndate;
        curdate.add(Calendar.DAY_OF_MONTH, issuetime);
        returndate = curdate;
        int ryear = returndate.get(Calendar.YEAR);
        int rmonth = returndate.get(Calendar.MONTH) + 1;
        int rdayOfMonth = returndate.get(Calendar.DAY_OF_MONTH);
        String rdate = "" + ryear + "-" + rmonth + "-" + rdayOfMonth;
        return rdate;
    }
}
