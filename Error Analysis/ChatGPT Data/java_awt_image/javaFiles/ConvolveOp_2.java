import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ConvolveOp;

public class ConvolveOp_2 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        ColorModel cm = src.getColorModel();

        ConvolveOp op = new ConvolveOp(null, ConvolveOp.EDGE_NO_OP, null);
        BufferedImage dest = op.createCompatibleDestImage(src, cm);

        System.out.println("Compatible destination image created successfully.");
    }
}
