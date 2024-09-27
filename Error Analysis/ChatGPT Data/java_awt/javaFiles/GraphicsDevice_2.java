import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GraphicsDevice_2 {
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        DisplayMode dm = gd.getDisplayMode();
        
        System.out.println("Width: " + dm.getWidth());
        System.out.println("Height: " + dm.getHeight());
        System.out.println("Refresh rate: " + dm.getRefreshRate());
    }
}
