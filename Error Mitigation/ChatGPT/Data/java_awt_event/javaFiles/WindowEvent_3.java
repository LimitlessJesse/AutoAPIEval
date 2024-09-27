import java.awt.Window;
import java.awt.event.WindowEvent;

public class WindowEvent_3 {
    public static void main(String[] args) {
        WindowEvent event = new WindowEvent(new Window(null), WindowEvent.WINDOW_OPENED);
        Window window = event.getWindow();
        System.out.println("Originator of the event: " + window);
    }
}
