import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_4 extends MouseAdapter {
    public static void main(String[] args) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }
}
