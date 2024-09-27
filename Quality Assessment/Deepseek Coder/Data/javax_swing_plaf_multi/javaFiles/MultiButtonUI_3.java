import javax.swing.*;
import javax.swing.plaf.multi.MultiButtonUI;
import java.awt.*;

public class MultiButtonUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        button.setUI(new CustomButtonUI());

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}

class CustomButtonUI extends MultiButtonUI {
    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);

        // Custom drawing code here
        g.setColor(Color.RED);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
    }
}
