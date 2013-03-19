/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.math.BigInteger;
import java.security.MessageDigest;
/**
 *
 * @author Shaleen
 */
public class md5hash {
    public static String  password(String password)
    { 
        String passwordmd5=null;
         try
          {
         MessageDigest md5 =MessageDigest.getInstance("MD5");
         md5.update(password.getBytes(),0,password.length());
         passwordmd5=new BigInteger(1,md5.digest()).toString(16);
         
          } catch (Exception e) {
              e.getMessage();
          }
         return passwordmd5;
    }

    public static String  passwordsalted(String password)
    { String passwordmd5=null;
      password= password+"cool";
         try
          {
         MessageDigest md5 =MessageDigest.getInstance("MD5");
         md5.update(password.getBytes(),0,password.length());
         passwordmd5=new BigInteger(1,md5.digest()).toString(16);
         
          } catch (Exception e) {
              e.getMessage();
          }
         return passwordmd5;
    }
}
