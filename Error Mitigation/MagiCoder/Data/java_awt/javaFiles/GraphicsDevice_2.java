import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GraphicsDevice_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        for (GraphicsDevice g : gs) {
            System.out.println(g.getConfigurations());
        }
    }
}
