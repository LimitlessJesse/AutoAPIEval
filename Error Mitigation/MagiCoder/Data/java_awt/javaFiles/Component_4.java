import java.awt.*;
import javax.swing.*;

public class Component_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JComponent component = new JComponent() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Hello, World!", 10, 20);
            }

            @Override
            public void update(Graphics g) {
                paint(g);
            }
        };

        frame.getContentPane().add(component);
        frame.setVisible(true);
    }
}
