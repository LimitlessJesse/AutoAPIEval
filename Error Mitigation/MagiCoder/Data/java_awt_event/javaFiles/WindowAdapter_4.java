import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_4 {
    public static void main(String[] args) {
        WindowAdapter adapter = new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }
        };

        // Assuming you have a window and you are adding the adapter to it
        // window.addWindowListener(adapter);
    }
}
