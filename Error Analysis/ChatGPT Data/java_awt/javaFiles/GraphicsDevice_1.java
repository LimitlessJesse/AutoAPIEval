import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GraphicsDevice_1 {
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        System.out.println(gc);
    }
}
