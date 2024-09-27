import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

public class ColorConvertOp_1 {
    public static void main(String[] args) {
        // Create a source BufferedImage
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        
        // Create a destination BufferedImage
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        
        // Create a ColorConvertOp object
        ColorConvertOp colorConvertOp = new ColorConvertOp(ColorConvertOp.TYPE_BGR2RGB);
        
        // Apply the filter to the source image and store the result in the destination image
        colorConvertOp.filter(src, dst);
    }
}
