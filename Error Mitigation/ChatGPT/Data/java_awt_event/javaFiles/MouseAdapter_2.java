import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_2 {
    public static void main(String[] args) {
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the component");
            }
        };
    }
}
