import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_5 extends MouseAdapter {
    public static void main(String[] args) {
        MouseAdapter_5 main = new MouseAdapter_5();
        // Assuming you have a JPanel or JComponent named 'component'
        component.addMouseListener(main);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse has exited the component");
    }
}
