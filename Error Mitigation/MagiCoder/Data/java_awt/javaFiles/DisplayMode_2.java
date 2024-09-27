import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class DisplayMode_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        DisplayMode dm = gd.getDisplayMode();
        int height = dm.getHeight();
        System.out.println("Display height: " + height);
    }
}
