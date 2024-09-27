import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_4 {
    
    public static void main(String[] args) {
        // Create a new window adapter
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified");
            }
        };
        
        // Simulate window being minimized
        adapter.windowIconified(new WindowEvent(new Object(), WindowEvent.WINDOW_ICONIFIED));
    }
}
