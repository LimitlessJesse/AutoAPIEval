import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ConvolveOp_1 {
    public static void main(String[] args) {
        // Create a 3x3 kernel
        float kernelData[] = {
            1.0f, 1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            1.0f, 1.0f, 1.0f
        };
        Kernel kernel = new Kernel(3, 3, kernelData);

        // Create a ConvolveOp object with the kernel
        ConvolveOp convolveOp = new ConvolveOp(kernel);

        // Create a source BufferedImage
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Create a destination BufferedImage
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Apply the filter to the source image and store the result in the destination image
        dst = convolveOp.filter(src, dst);
    }
}
