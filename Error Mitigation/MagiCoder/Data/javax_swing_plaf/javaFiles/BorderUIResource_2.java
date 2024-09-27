import javax.swing.*;
import java.awt.*;

public class BorderUIResource_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton button = new JButton("Click me");
        button.setBounds(50, 50, 100, 30);
        frame.getContentPane().add(button);

        BorderUIResource border = new BorderUIResource();
        Insets insets = border.getBorderInsets(button);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
