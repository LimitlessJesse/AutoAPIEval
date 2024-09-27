import javax.swing.*;
import javax.swing.plaf.multi.MultiToolTipUI;
import java.awt.*;

public class MultiToolTipUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ToolTip Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = new JButton("Hover Me");
        button.setToolTipText("This is a tooltip");

        button.setUI(new MultiToolTipUI() {
            @Override
            protected void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                // Custom painting code goes here
                g.setColor(Color.RED);
                g.drawString("Custom Tooltip", c.getWidth() / 2, c.getHeight() / 2);
            }
        });

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
