import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_1 {
    public static void main(String[] args) {
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }
        };

        // You can use the windowAdapter here, for example, to add it to a window's listeners
    }
}
