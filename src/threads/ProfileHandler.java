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

package threads;

import Javapackage.AboutUs;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingWorker;
import myClasses.Img;
import myClasses.JarLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author 500029490
 */
public class ProfileHandler extends SwingWorker<Void, Void> {
    
    URL url1;
    Image img1;
    private JLabel pht1;
    final static Logger logger = LoggerFactory.getLogger(ProfileHandler.class);
    
    
    public ProfileHandler(JLabel pht1){
        this.pht1 = pht1;
    }
        
        @Override
        protected Void doInBackground() {
         
            try
            {
                //get the images
                 url1 = new URL("https://graph.facebook.com/shaleen.jain3/picture?width=100&height=100");
                 img1=Img.enhancedImage(url1);                
            }
            catch (java.net.MalformedURLException e) 
            {
                logger.error("Error Description:", e);
                return null;
            }
            
            try
            {
                ImageIO.write((RenderedImage)img1, "jpg", new File(JarLocation.getLocation(new AboutUs())+"\\images\\11510497108122122.jpg"));
            }
            catch(java.io.IOException e)
            {
                logger.error("Error Description:", e);
            }
             return null;
        }

        @Override
        protected void done() {
            try 
            {
                //set the images
                pht1.setIcon(new ImageIcon(img1));                                
            } 
            catch (Exception e)
            {
                logger.error("Error Description:", e);
            }
        }
    
}
