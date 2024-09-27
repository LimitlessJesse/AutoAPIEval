import javax.swing.*;
import java.awt.*;

public class OverlayLayout_1 {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new OverlayLayout(new JPanel()));
        JButton button = new JButton("Click me");
        panel.addLayoutComponent(button, OverlayLayout.NORTH);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
