import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.awt.image.ImageCapabilities;

public class ImageCapabilities_1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        ImageProducer producer = new MemoryImageSource(10, 10, null, 0, 10);
        Image image = toolkit.createImage(producer);
        ImageCapabilities capabilities = image.getCapabilities(null);
        boolean isVolatile = capabilities.isTrueVolatile();
        System.out.println("isTrueVolatile: " + isVolatile);
    }
}
