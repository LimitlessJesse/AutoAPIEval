import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.RasterFormatException;

public class AffineTransformOp_2 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorModel destCM = null;

        AffineTransformOp affineTransformOp = new AffineTransformOp(null, AffineTransformOp.TYPE_BILINEAR);
        try {
            BufferedImage destImage = affineTransformOp.createCompatibleDestImage(src, destCM);
            System.out.println("Destination image created successfully.");
        } catch (RasterFormatException e) {
            System.out.println("RasterFormatException: " + e.getMessage());
        }
    }
}
