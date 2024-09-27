import java.awt.Window;
import java.awt.Toolkit;

public class Window_17 {
    public static void main(String[] args) {
        Window window = new Window(null);
        if (Toolkit.getDefaultToolkit().isAlwaysOnTopSupported()) {
            window.setAlwaysOnTop(true);
        }
    }
}
