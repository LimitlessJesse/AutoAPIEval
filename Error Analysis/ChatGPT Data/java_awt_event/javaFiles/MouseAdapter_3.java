import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_3 {
    public static void main(String[] args) {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited");
            }
        };
    }
}
