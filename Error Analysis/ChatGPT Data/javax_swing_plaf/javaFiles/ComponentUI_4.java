import javax.swing.plaf.ComponentUI;
import javax.swing.*;
import java.awt.*;

public class ComponentUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        JComponent component = new JComponent() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                // Custom painting code here
                g.setColor(Color.RED);
                g.fillRect(50, 50, 100, 100);
            }
        };

        frame.add(component);
    }
}
