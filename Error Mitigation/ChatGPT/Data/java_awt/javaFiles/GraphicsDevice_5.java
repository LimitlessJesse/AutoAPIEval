import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

public class GraphicsDevice_5 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        
        // Create a window to use as full-screen
        Window window = new Window(null);
        
        // Enter full-screen mode
        gd.setFullScreenWindow(window);
        
        // Perform operations in full-screen mode
        
        // Return to windowed mode
        gd.setFullScreenWindow(null);
    }
}
