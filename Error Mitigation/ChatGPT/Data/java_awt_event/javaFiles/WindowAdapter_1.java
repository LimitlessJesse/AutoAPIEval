import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_1 {
    public static void main(String[] args) {
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }
        };
    }
}
