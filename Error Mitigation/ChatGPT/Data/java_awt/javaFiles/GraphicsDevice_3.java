import java.awt.GraphicsDevice;
import java.awt.DisplayMode;

public class GraphicsDevice_3 {
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        DisplayMode[] displayModes = gd.getDisplayModes();
        
        System.out.println("Display Modes available:");
        for(DisplayMode mode : displayModes) {
            System.out.println("Width: " + mode.getWidth() + ", Height: " + mode.getHeight() + ", Bit Depth: " + mode.getBitDepth() + ", Refresh Rate: " + mode.getRefreshRate());
        }
    }
}
