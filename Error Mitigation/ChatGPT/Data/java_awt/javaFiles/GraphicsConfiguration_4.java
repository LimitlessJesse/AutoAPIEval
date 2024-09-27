import java.awt.GraphicsConfiguration;
import java.awt.ImageCapabilities;

public class GraphicsConfiguration_4 {
    public static void main(String[] args) {
        GraphicsConfiguration graphicsConfiguration = // obtain GraphicsConfiguration object
        ImageCapabilities imageCapabilities = graphicsConfiguration.getImageCapabilities();
        System.out.println(imageCapabilities);
    }
}
