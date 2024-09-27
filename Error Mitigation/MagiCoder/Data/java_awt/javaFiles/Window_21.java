import java.awt.Dimension;
import java.awt.Window;

public class Window_21 {
    public static void main(String[] args) {
        Window window = new Window(null);
        Dimension minSize = new Dimension(200, 200);
        window.setMinimumSize(minSize);
    }
}
