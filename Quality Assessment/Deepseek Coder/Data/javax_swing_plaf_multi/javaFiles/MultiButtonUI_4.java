import javax.swing.*;
import javax.swing.plaf.multi.MultiButtonUI;
import java.awt.*;

public class MultiButtonUI_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.setUI(new MultiButtonUI() {
            @Override
            public void update(Graphics g, JComponent c) {
                super.update(g, c);
                // Here you can put your custom painting code
                // For example, you might draw a rectangle around the button
                g.setColor(Color.RED);
                g.drawRect(0, 0, c.getWidth()-1, c.getHeight()-1);
            }
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
