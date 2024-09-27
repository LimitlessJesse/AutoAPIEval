import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ConvolveOp_1 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        
        // Create a ConvolveOp object with a 3x3 kernel
        float[] kernelData = {
            0.1f, 0.1f, 0.1f,
            0.1f, 0.2f, 0.1f,
            0.1f, 0.1f, 0.1f
        };
        Kernel kernel = new Kernel(3, 3, kernelData);
        ConvolveOp convolveOp = new ConvolveOp(kernel);
        
        // Apply the convolution filter
        BufferedImage filteredImage = convolveOp.filter(src, dst);
        
        // Display or further process the filtered image
    }
}
