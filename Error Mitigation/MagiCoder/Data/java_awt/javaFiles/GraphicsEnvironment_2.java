import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

public class GraphicsEnvironment_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gd = ge.getScreenDevices();

        for (int i = 0; i < gd.length; i++) {
            System.out.println("Device " + i + ": " + gd[i].getType());
        }
    }
}
