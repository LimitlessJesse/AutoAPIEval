import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class WindowAdapter_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Event Example");
        frame.setSize(300, 200);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified");
            }
        });
        frame.setVisible(true);
    }
}
