import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_5 {
    public static void main(String[] args) {
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window de-iconified");
            }
        };
    }
}
