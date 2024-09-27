import java.awt.Window;
import java.awt.GraphicsDevice;
import java.awt.GraphicsConfiguration;

public class Window_18 {
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        Window window = gc.createWindow(100, 100, 200, 200, true);

        try {
            window.setOpacity(0.5f);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalComponentStateException e) {
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}
