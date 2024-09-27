import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_4 extends MouseAdapter {
    public static void main(String[] args) {
        MouseAdapter_4 main = new MouseAdapter_4();
        main.mouseEntered(null); // Call the method
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the component");
    }
}
