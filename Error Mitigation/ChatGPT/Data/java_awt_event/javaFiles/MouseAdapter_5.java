import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_5 {
    public static void main(String[] args) {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // Add your custom implementation here
                System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
            }
        };
    }
}
