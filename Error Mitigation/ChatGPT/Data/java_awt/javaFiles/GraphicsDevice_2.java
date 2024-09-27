import java.awt.GraphicsDevice;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

public class GraphicsDevice_2 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        
        DisplayMode displayMode = gd.getDisplayMode();
        
        System.out.println("Display Mode:");
        System.out.println("Width: " + displayMode.getWidth());
        System.out.println("Height: " + displayMode.getHeight());
        System.out.println("Refresh Rate: " + displayMode.getRefreshRate());
        System.out.println("Bit Depth: " + displayMode.getBitDepth());
    }
}
