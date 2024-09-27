import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_5 {
    public static void main(String[] args) {
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowDeiconified(WindowEvent e) {
                // Your code here
            }
        };
    }
}
