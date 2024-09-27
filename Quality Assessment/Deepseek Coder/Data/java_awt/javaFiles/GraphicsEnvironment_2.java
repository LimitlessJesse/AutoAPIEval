import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

public class GraphicsEnvironment_2 {
    public static void main(String[] args) {
        GraphicsDevice[] devices = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        for (GraphicsDevice device : devices) {
            System.out.println(device.getType() + ": " + device.getIDstring());
        }
    }
}
