import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ConvolveOp_1 {
    public static void main(String[] args) {
        // Create a sample BufferedImage
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        
        // Create the kernel matrix for blurring
        float[] matrix = {
            0.1f, 0.1f, 0.1f,
            0.1f, 0.2f, 0.1f,
            0.1f, 0.1f, 0.1f
        };
        Kernel kernel = new Kernel(3, 3, matrix);
        
        // Apply the ConvolveOp filter
        ConvolveOp op = new ConvolveOp(kernel);
        BufferedImage dest = op.filter(src, null);
        
        // Display the filtered image or do other operations
    }
}
