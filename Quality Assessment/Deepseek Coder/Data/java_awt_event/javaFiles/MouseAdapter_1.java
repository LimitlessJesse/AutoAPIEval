import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_1 extends MouseAdapter {
    public static void main(String[] args) {
        MouseAdapter_1 main = new MouseAdapter_1();
        main.mouseClicked(null); // This will call the mouseClicked method
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }
}
