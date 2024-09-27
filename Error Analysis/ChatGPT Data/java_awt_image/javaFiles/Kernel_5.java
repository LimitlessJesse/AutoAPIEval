import java.awt.image.Kernel;

public class Kernel_5 {
    public static void main(String[] args) {
        // Create a Kernel object
        float[] data = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f};
        Kernel kernel = new Kernel(3, 3, data);

        // Retrieve the kernel data
        float[] retrievedData = kernel.getKernelData(data);

        // Print the retrieved kernel data
        for (float value : retrievedData) {
            System.out.print(value + " ");
        }
    }
}
