import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window_4 {
    public static void main(String[] args) {
        Window window = new Window(null) {
            {
                setSize(300, 200);
                addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        };

        // Make the window visible
        window.setVisible(true);

        // Wait for a while
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Make the window invisible
        window.setVisible(false);
    }
}
