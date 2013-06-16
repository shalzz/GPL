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
import java.math.BigInteger;
import java.security.MessageDigest;
/**
 *
 * @author Shaleen
 */
public class Md5Hash {
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
