import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_1 {

    public static void main(String[] args) {
        // Creating a MouseAdapter object
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Code to handle mouse click event
                System.out.println("Mouse Clicked!");
            }
        };
    }
}
