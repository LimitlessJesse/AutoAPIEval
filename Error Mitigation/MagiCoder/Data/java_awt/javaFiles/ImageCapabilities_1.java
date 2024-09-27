import java.awt.GraphicsEnvironment;
import java.awt.GraphicsConfiguration;
import java.awt.Transparency;
import java.awt.image.ImageProducer;
import java.awt.image.ImageCapabilities;

public class ImageCapabilities_1 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsConfiguration gc = ge.getDefaultScreenDevice().getDefaultConfiguration();
        ImageProducer ip = null; // replace with your ImageProducer
        ImageCapabilities ic = gc.getCapabilities(ip);
        boolean isAccelerated = ic.isAccelerated();
        System.out.println("Is the image accelerated? " + isAccelerated);
    }
}
