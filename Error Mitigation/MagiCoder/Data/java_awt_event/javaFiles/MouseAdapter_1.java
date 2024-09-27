import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_1 {
    public static void main(String[] args) {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
            }
        };

        // Now you can add this mouse adapter to any component you want to listen for mouse events.
        // For example, if you have a JButton named button:
        // button.addMouseListener(mouseAdapter);
    }
}
