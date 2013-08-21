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

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Shaleen
 */
public class Img {
    // resizes from url, returns imageIcon
    public static ImageIcon resizedImage(URL url,int width,int height) {
        Image image=null;
        try {
            image = ImageIO.read(url);
        } catch (Exception e) {
        }
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(image, 0, 0, width, height, null); 
        g.dispose();
        return new ImageIcon(resizedImage);
    }
    // resizes imageIcon, returns imageIcon
 public static ImageIcon resizedImage(ImageIcon img,int width,int height) {
        Image image = img.getImage();
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(image, 0, 0, width, height, null);  
        g.dispose();
        return new ImageIcon(resizedImage);
    }
 // resizes from url, enhances, returns imageIcon
    public static ImageIcon resizedplusImageIcon(URL url,int width,int height) {
        Image image=null;
        try {
            image = ImageIO.read(url);
        } catch (Exception e) {
        }
        double aspectRatio = (double) image.getWidth(null)/(double) image.getHeight(null);
        BufferedImage resizedImage = new BufferedImage(width, (int)(height/aspectRatio), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(image, 0, 0, width, (int)(height/aspectRatio), null); 
        g.dispose();
        return new ImageIcon(resizedImage);
    }
    // resizes from url, enhances, returns Image
    public static Image resizedplusImage(URL url,int width,int height) {
        Image image=null;
        try {
            image = ImageIO.read(url);
        } catch (Exception e) {
        }
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(image, 0, 0, width, height, null); 
        g.dispose();
        return resizedImage;
    }
    //resizes imageIcon, enhances, returns imageIcon
    public static ImageIcon resizedplusImageIcon(ImageIcon img,int width,int height) {
        Image image = img.getImage();
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(image, 0, 0, width, height, null);  
        g.dispose();
        return new ImageIcon(resizedImage);
    }
    // enhance from url, returns imageIcon
    public static ImageIcon enhancedImageIcon(URL url) {
        Image image=null;
        try {
            image = ImageIO.read(url);
        } catch (Exception e) {
        }
        BufferedImage resizedImage = (BufferedImage)image;
        Graphics2D g = resizedImage.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.dispose();
        return new ImageIcon(resizedImage);
    }
       // enhance from url, returns Image
    public static Image enhancedImage(URL url) {
        Image image=null;
        try {
            image = ImageIO.read(url);
        } catch (Exception e) {
        }
        BufferedImage resizedImage = (BufferedImage)image;
        Graphics2D g = resizedImage.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.dispose();
        return resizedImage;
    }
    
   
}
