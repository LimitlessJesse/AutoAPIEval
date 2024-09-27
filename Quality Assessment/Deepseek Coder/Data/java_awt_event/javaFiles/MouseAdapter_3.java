import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_3 extends MouseAdapter {

    public static void main(String[] args) {
        MouseAdapter_3 main = new MouseAdapter_3();
        // Assuming we have a JPanel or JButton here
        // panel.addMouseListener(main);
        // button.addMouseListener(main);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }
}
