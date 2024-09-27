import java.awt.image.Kernel;

public class Kernel_2 {
    public static void main(String[] args) {
        // Create a new Kernel
        Kernel kernel = new Kernel(3, 3, new float[] {
            0, 1, 0,
            1, 1, 1,
            0, 1, 0
        });

        // Get the height of the Kernel
        int height = kernel.getHeight();

        // Print the height
        System.out.println("Height of the Kernel: " + height);
    }
}
