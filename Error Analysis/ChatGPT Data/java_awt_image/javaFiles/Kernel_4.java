import java.awt.image.Kernel;

public class Kernel_4 {
    public static void main(String[] args) {
        Kernel kernel = new Kernel(3, 3, new float[]{1, 1, 1, 1, 1, 1, 1, 1, 1});
        int height = kernel.getHeight();
        System.out.println("Kernel height: " + height);
    }
}
