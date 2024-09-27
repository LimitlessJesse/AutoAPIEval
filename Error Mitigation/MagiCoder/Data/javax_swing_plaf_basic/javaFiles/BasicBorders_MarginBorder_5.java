import javax.swing.*;
import java.awt.*;

public class BasicBorders_MarginBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton button = new JButton("Button");
        button.setBorder(new BasicBorders.MarginBorder());

        frame.getContentPane().add(button);

        Insets insets = new Insets(0, 0, 0, 0);
        button.getBorder().getBorderInsets(button, insets);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
