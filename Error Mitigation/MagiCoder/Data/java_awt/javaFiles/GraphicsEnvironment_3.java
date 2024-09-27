import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import java.awt.HeadlessException;

public class GraphicsEnvironment_3 {
    public static void main(String[] args) {
        try {
            GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            System.out.println("Default Screen Device: " + gd);
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
    }
}
