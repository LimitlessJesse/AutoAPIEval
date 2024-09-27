import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_8 {
    public static void main(String[] args) {
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("Window gained focus");
            }
        };

        // You can use the windowAdapter here, for example, to add it to a Window
        // window.addWindowFocusListener(windowAdapter);
    }
}
