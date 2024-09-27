import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_2 extends MouseAdapter {
    public static void main(String[] args) {
        MouseAdapter_2 main = new MouseAdapter_2();
        main.mousePressed(null); // This will call the mousePressed method
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }
}
