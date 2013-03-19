/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
public class image {
    
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
    
 public static ImageIcon resizedImage(ImageIcon img,int width,int height) {
        Image image = img.getImage();
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(image, 0, 0, width, height, null);  
        g.dispose();
        return new ImageIcon(resizedImage);
    }
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
        g.drawImage(image, 0, 0, width, height, null); 
        g.dispose();
        return new ImageIcon(resizedImage);
    }
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
    
    public static ImageIcon enhancedImage(URL url,int width,int height) {
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
    
   
}
