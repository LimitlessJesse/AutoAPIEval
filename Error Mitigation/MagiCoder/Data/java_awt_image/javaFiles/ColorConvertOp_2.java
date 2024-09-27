import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.RenderingHints;

public class ColorConvertOp_2 {
    public static void main(String[] args) {
        BufferedImage sourceImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ColorConvertOp colorConvertOp = new ColorConvertOp(null, null, null);
        RenderingHints renderingHints = colorConvertOp.getRenderingHints();
        System.out.println(renderingHints);
    }
}
