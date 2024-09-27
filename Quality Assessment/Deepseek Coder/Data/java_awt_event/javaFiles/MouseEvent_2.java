import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;

public class MouseEvent_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int y = e.getY();
                System.out.println("Mouse clicked at y-coordinate: " + y);
            }
        });

        frame.setVisible(true);
    }
}
