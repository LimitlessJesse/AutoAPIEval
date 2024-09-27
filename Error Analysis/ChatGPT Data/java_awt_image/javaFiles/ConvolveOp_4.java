import java.awt.RenderingHints;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ConvolveOp_4 {
    public static void main(String[] args) {
        float[] matrix = {
            1/9f, 1/9f, 1/9f,
            1/9f, 1/9f, 1/9f,
            1/9f, 1/9f, 1/9f
        };
        
        Kernel kernel = new Kernel(3, 3, matrix);
        ConvolveOp convolveOp = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, new RenderingHints(null));
        
        RenderingHints hints = convolveOp.getRenderingHints();
        System.out.println("RenderingHints: " + hints);
    }
}
