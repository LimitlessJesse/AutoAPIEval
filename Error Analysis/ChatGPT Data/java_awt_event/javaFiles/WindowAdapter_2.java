import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_2 {
    public static void main(String[] args) {
        // Create a window adapter with windowClosing method overridden
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Perform actions when window is closing
                System.out.println("Window is closing...");
            }
        };

        // Simulate window closing event
        WindowEvent closingEvent = new WindowEvent(new Object(), WindowEvent.WINDOW_CLOSING);
        windowAdapter.windowClosing(closingEvent);
    }
}
