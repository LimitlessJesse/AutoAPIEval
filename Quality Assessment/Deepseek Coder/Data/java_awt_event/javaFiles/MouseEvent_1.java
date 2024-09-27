import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MouseEvent_1 {
    public static void main(String[] args) {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse clicked at x: " + x + ", y: " + y);
            }
        };

        // Assuming you have a component (like a JButton) and you attach the mouse listener
        // component.addMouseListener(mouseAdapter);
    }
}
