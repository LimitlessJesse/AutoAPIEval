import java.awt.image.VolatileImage;

public class VolatileImage_3 {
    public static void main(String[] args) {
        VolatileImage image = new VolatileImage(100, 100);
        ImageCapabilities capabilities = image.getCapabilities();
        System.out.println("Is Accelerated: " + capabilities.isTrue(VolatileImage.ImageCapAccelerated));
        System.out.println("Is Rastered: " + capabilities.isTrue(VolatileImage.ImageCapRaster));
    }
}
