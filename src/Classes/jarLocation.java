/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Component;
import java.net.URL;

/**
 *
 * @author Shaleen
 */
public class jarLocation {

    public static String getLocationunfixed(Component parentComponent) {
        URL url = parentComponent.getClass().getProtectionDomain().getCodeSource().getLocation();
        String loc = url.toString();
        int index = loc.lastIndexOf("GPL")+4;
        String path = loc.substring(6, index);
        return path;
    }
    public static String getLocation(Component parentComponent) {
        URL url = parentComponent.getClass().getProtectionDomain().getCodeSource().getLocation();
        String loc = url.toString();
        int index = loc.lastIndexOf("GPL")+4;
        String path = loc.substring(6, index);
        path=path.replace('/', '\\');        
        return path;
    }
}
