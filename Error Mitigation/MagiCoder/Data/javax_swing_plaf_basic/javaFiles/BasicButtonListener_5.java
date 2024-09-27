import javax.swing.*;
import java.awt.event.MouseEvent;
import javax.swing.plaf.basic.BasicButtonListener;

public class BasicButtonListener_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.addMouseListener(new BasicButtonListener() {
            @Override
            public void mouseExited(MouseEvent e) {
                // Handle the event when the mouse cursor leaves the component
                System.out.println("Mouse cursor has left the component");
            }
        });
    }
}
