import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.RescaleOp;

public class RescaleOp_2 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorModel destCM = src.getColorModel();
        
        RescaleOp rescaleOp = new RescaleOp(new float[]{1.2f, 1.2f, 1.2f}, new float[]{0, 0, 0}, null);
        BufferedImage destImage = rescaleOp.createCompatibleDestImage(src, destCM);
        
        System.out.println("Destination image created: " + destImage);
    }
}
