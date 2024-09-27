import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

public class GraphicsDevice_5 {
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        Window w = new Window(null); // Create a new window to set as full screen
        
        gd.setFullScreenWindow(w);
    }
}
