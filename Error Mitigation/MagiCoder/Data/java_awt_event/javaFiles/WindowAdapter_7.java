import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_7 {
    public static void main(String[] args) {
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }
        };

        // Assuming you have a window here
        // window.addWindowListener(windowAdapter);
    }
}
