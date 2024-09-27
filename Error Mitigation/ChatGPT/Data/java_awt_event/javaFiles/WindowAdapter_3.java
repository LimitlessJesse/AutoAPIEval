import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_3 {
    public static void main(String[] args) {
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window has been closed");
            }
        };
    }
}
