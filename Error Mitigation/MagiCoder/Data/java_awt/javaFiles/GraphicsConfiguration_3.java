import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;

public class GraphicsConfiguration_3 {
    public static void main(String[] args) {
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        GraphicsDevice device = gc.getDevice();
        System.out.println(device);
    }
}
