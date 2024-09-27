import java.awt.ImageCapabilities;
import java.awt.image.VolatileImage;

public class VolatileImage_5 {
    public static void main(String[] args) {
        VolatileImage volatileImage = new VolatileImage();
        ImageCapabilities capabilities = volatileImage.getCapabilities();
        System.out.println(capabilities);
    }
}
