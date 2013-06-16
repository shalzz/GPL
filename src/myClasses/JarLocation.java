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

import java.awt.Component;
import java.net.URL;

/**
 *
 * @author Shaleen
 */
public class JarLocation {

    public static String getLocationUnfixed(Component parentComponent) {
        URL url = parentComponent.getClass().getProtectionDomain().getCodeSource().getLocation();
        String loc = url.toString();
        int index = loc.lastIndexOf("GPL");
        String path = loc.substring(6, index);
        return path;
    }
    
    public static String getLocation(Component parentComponent) {
        URL url = parentComponent.getClass().getProtectionDomain().getCodeSource().getLocation();
        String loc = url.toString();
        int index = loc.lastIndexOf("GPL");
        String path = loc.substring(6, index);
        path=path.replace('/', '\\');        
        return path;
    }
}
