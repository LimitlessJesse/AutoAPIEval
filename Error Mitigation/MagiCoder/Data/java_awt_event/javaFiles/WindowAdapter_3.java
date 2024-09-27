import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_3 {
    public static void main(String[] args) {
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
            }
        };
    }
}
