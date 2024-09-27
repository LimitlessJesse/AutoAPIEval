import java.awt.image.Kernel;

public class Kernel_4 {
    public static void main(String[] args) {
        // Create a new Kernel
        Kernel kernel = new Kernel(3, 3, new float[] {
            0, 1, 0,
            1, 1, 1,
            0, 1, 0
        });

        // Get the width of the Kernel
        int width = kernel.getWidth();

        // Print the width
        System.out.println("Width of the Kernel: " + width);
    }
}
