import javax.swing.*;
import javax.swing.plaf.basic.BasicToolTipUI;
import java.awt.*;

public class BasicToolTipUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolTip toolTip = new JToolTip();
        toolTip.setUI(new BasicToolTipUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                g.setColor(Color.BLACK);
                g.drawString("Hello, World!", 10, 20);
            }
        });

        JButton button = new JButton("Click me!");
        button.setToolTipText("This is a tooltip!");
        button.setToolTipUI(toolTip);

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
