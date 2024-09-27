import java.awt.image.Kernel;

public class Kernel_1 {
    public static void main(String[] args) {
        float[] data = {1, 2, 1, 2, 4, 2, 1, 2, 1};
        Kernel kernel = new Kernel(3, 3, data);

        int xOrigin = kernel.getXOrigin();
        System.out.println("X origin: " + xOrigin);
    }
}
