import java.awt.image.Kernel;

public class Kernel_2 {
    public static void main(String[] args) {
        // Create a new Kernel
        float[] data = new float[9];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        Kernel kernel = new Kernel(3, 3, data);

        // Get the height of the Kernel
        int height = kernel.getHeight();

        // Print the height
        System.out.println("Height of the Kernel: " + height);
    }
}
