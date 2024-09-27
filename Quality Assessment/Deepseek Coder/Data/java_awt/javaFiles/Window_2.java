import java.awt.Window;
import java.awt.Dimension;

public class Window_2 {
    public static void main(String[] args) {
        Window window = new Window(new Dimension(300, 200));
        window.setLocation(100, 100);
        window.setVisible(true);
    }
}
