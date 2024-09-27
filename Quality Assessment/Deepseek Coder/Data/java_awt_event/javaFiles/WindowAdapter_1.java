import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class WindowAdapter_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Event Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }
        });

        frame.setVisible(true);
    }
}
