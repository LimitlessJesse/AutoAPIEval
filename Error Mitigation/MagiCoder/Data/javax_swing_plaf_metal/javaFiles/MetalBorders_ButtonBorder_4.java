import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_ButtonBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.setBorder(new MetalBorders.ButtonBorder());

        button.addActionListener(e -> {
            Graphics g = button.getGraphics();
            button.paintBorder(button, g, 0, 0, button.getWidth(), button.getHeight());
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
