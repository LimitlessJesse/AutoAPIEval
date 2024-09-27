import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_4 {
    public static void main(String[] args) {
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified");
            }
        };
    }
}
