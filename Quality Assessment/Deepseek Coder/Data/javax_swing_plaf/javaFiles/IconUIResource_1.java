import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.awt.*;

public class IconUIResource_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                IconUIResource icon = new IconUIResource() {
                    @Override
                    public void paintIcon(Component c, Graphics g, int x, int y) {
                        g.setColor(Color.RED);
                        g.fillOval(x, y, getIconWidth(), getIconHeight());
                    }

                    @Override
                    public int getIconWidth() {
                        return 50;
                    }

                    @Override
                    public int getIconHeight() {
                        return 50;
                    }
                };
                icon.paintIcon(this, g, 100, 100);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
