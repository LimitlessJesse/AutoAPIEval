import javax.swing.*;
import javax.swing.plaf.metal.MetalComboBoxIcon;
import java.awt.*;

public class MetalComboBoxIcon_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MetalComboBoxIcon icon = new MetalComboBoxIcon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                g.setColor(Color.RED);
                g.fillRect(x, y, getIconWidth(), getIconHeight());
            }

            @Override
            public int getIconWidth() {
                return 20;
            }

            @Override
            public int getIconHeight() {
                return 20;
            }
        };

        JLabel label = new JLabel("ComboBox", icon, SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}
