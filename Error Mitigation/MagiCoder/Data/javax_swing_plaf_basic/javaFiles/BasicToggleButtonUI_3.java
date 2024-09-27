import javax.swing.*;
import java.awt.*;

public class BasicToggleButtonUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BasicToggleButtonUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToggleButton button = new JToggleButton("Click me");
        button.setUI(new BasicToggleButtonUI());

        button.addActionListener(e -> {
            Graphics g = button.getGraphics();
            button.paint(g);
        });

        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
