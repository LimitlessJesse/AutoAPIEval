import java.awt.image.ConvolveOp;
import java.awt.image.RenderingHints;

public class ConvolveOp_3 {
    public static void main(String[] args) {
        ConvolveOp convolveOp = new ConvolveOp(null);
        RenderingHints hints = convolveOp.getRenderingHints();
        System.out.println("Rendering Hints: " + hints);
    }
}
