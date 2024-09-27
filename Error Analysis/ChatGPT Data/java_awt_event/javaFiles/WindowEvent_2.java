import java.awt.event.WindowEvent;
import java.awt.Window;

public class WindowEvent_2 {
    public static void main(String[] args) {
        WindowEvent windowEvent = new WindowEvent(new Window(null), WindowEvent.WINDOW_CLOSING);
        Window window = windowEvent.getWindow();
        System.out.println("Window: " + window);
    }
}
