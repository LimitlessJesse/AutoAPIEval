import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.DisplayMode;

public class GraphicsDevice_3 {
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        DisplayMode[] modes = gd.getDisplayModes();
        
        System.out.println("Available Display Modes:");
        for (DisplayMode mode : modes) {
            System.out.println("Width: " + mode.getWidth() + ", Height: " + mode.getHeight() + ", Refresh Rate: " + mode.getRefreshRate());
        }
    }
}
