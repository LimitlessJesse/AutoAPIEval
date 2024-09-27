import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

public class Window_3 {
    public static void main(String[] args) {
        Window window = new Window(new Dimension(800, 600));
        window.setVisible(true);

        // Get the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Set the window size to half of the screen size
        window.setSize(screenSize.width / 2, screenSize.height / 2);
    }
}
