import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.GraphicsEnvironment;

public class GraphicsConfiguration_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsConfiguration gc = ge.getDefaultScreenDevice().getDefaultConfiguration();
        
        Rectangle bounds = gc.getBounds();
        System.out.println("Bounds: " + bounds);
    }
}
