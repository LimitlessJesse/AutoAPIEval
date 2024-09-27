import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;

public class GraphicsEnvironment_1 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            GraphicsDevice[] screenDevices = ge.getScreenDevices();
            for (GraphicsDevice device : screenDevices) {
                System.out.println("Screen Device: " + device);
            }
        } catch (HeadlessException e) {
            System.out.println("HeadlessException occurred: " + e.getMessage());
        }
    }
}
