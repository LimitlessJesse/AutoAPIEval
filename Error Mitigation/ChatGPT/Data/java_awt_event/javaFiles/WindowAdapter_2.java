import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_2 {
    public static void main(String[] args) {
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Add your custom code here to handle the window closing event
                System.out.println("Window is closing");
            }
        };
    }
}
