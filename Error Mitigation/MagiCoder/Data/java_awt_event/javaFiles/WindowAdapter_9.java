import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_9 {
    public static void main(String[] args) {
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("Window lost focus");
            }
        };

        // Assuming you have a window, you can add the listener
        // window.addWindowFocusListener(windowAdapter);
    }
}
