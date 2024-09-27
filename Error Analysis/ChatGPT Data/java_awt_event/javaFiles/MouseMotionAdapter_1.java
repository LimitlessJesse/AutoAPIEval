import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseMotionAdapter_1 {
    public static void main(String[] args) {
        MouseMotionAdapter adapter = new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse dragged at x=" + e.getX() + ", y=" + e.getY());
            }
        };
    }
}
