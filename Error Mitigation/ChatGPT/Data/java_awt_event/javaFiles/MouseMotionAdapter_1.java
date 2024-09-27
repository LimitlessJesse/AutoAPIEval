import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAdapter_1 {
    public static void main(String[] args) {
        MouseMotionAdapter adapter = new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Add your custom implementation here
                System.out.println("Mouse dragged at: " + e.getX() + ", " + e.getY());
            }
        };
    }
}
