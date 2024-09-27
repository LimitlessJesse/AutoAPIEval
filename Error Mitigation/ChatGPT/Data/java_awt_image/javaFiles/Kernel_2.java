import java.awt.image.Kernel;

public class Kernel_2 {
    public static void main(String[] args) {
        Kernel kernel = new Kernel(3, 3, new float[]{0, 0, 0, 0, 1, 0, 0, 0, 0});
        int height = kernel.getHeight();
        System.out.println("Height of the kernel: " + height);
    }
}
