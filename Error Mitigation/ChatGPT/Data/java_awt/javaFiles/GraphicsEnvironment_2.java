import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;

public class GraphicsEnvironment_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            GraphicsDevice defaultScreenDevice = ge.getDefaultScreenDevice();
            System.out.println("Default Screen Device: " + defaultScreenDevice);
        } catch (HeadlessException e) {
            System.out.println("HeadlessException: " + e.getMessage());
        }
    }
}
