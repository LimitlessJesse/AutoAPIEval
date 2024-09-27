import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ConvolveOp;

public class ConvolveOp_5 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorModel destCM = null;
        
        ConvolveOp convolveOp = new ConvolveOp(null);
        BufferedImage destImage = convolveOp.createCompatibleDestImage(src, destCM);
        
        System.out.println("Destination Image Size: " + destImage.getWidth() + "x" + destImage.getHeight());
    }
}
