import javax.swing.*;
import javax.swing.plaf.basic.BasicToolTipUI;
import java.awt.*;

public class BasicToolTipUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = new JButton("Hover me");
        button.setToolTipText("This is a tooltip");
        button.setUI(new BasicToolTipUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                g.setColor(Color.RED);
                g.drawString("Custom Tooltip", 10, 20);
            }
        });

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
