import java.awt.ImageCapabilities;

public class ImageCapabilities_2 {
    public static void main(String[] args) {
        ImageCapabilities imageCapabilities = new ImageCapabilities();
        boolean isAcc = imageCapabilities.isAccelerated();
        System.out.println("Is Accelerated: " + isAcc);
    }
}
