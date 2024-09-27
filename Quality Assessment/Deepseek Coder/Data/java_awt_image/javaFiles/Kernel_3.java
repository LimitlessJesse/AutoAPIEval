import java.awt.image.Kernel;

public class Kernel_3 {
    public static void main(String[] args) {
        // Create a new Kernel
        float kernelData[] = new float[25];
        Kernel kernel = new Kernel(5, 5, kernelData);
        
        // Get the width of the kernel
        int width = kernel.getWidth();
        
        // Print the width of the kernel
        System.out.println("Width of the kernel: " + width);
    }
}
