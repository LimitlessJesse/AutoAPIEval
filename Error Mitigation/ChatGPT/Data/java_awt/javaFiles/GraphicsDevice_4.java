import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsConfiguration;

public class GraphicsDevice_4 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gdArray = ge.getScreenDevices();
        
        for (GraphicsDevice gd : gdArray) {
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            System.out.println("Default GraphicsConfiguration of GraphicsDevice: " + gc);
        }
    }
}
