import java.awt.image.Kernel;

public class Kernel_3 {
    public static void main(String[] args) {
        float[] data = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f};
        Kernel kernel = new Kernel(3, 3, data);
        
        int width = kernel.getWidth();
        System.out.println("Kernel width: " + width);
    }
}
