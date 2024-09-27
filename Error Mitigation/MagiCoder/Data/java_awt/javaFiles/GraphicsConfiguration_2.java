import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class GraphicsConfiguration_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsConfiguration[] gc = ge.getScreenConfigurations();
        for (int i = 0; i < gc.length; i++) {
            Rectangle bounds = gc[i].getBounds();
            System.out.println("Bounds of GraphicsConfiguration " + i + ": " + bounds);
        }
    }
}
