import java.awt.image.Kernel;

public class Kernel_1 {
    public static void main(String[] args) {
        Kernel kernel = new Kernel(3, 3, new float[]{0, 0, 0, 0, 1, 0, 0, 0, 0});
        int width = kernel.getWidth();
        System.out.println("Kernel width: " + width);
    }
}
