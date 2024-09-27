import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GraphicsEnvironment_2 {
    public static void main(String[] args) {
        GraphicsDevice screenDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        System.out.println(screenDevice);
    }
}
