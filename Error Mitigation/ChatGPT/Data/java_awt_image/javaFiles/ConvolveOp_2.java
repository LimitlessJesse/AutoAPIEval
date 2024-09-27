import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ConvolveOp_2 {
    public static void main(String[] args) {
        float[] matrix = { 0.1f, 0.1f, 0.1f,
                            0.1f, 0.2f, 0.1f,
                            0.1f, 0.1f, 0.1f };
        Kernel kernel = new Kernel(3, 3, matrix);
        
        ConvolveOp convolveOp = new ConvolveOp(kernel);
        Kernel returnedKernel = convolveOp.getKernel();
        
        System.out.println("Returned Kernel: " + returnedKernel.toString());
    }
}
