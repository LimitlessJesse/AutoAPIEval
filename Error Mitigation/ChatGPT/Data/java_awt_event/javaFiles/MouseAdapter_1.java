import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_1 {
    public static void main(String[] args) {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Add your custom implementation here
                System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            }
        };
    }
}
