import javax.swing.*;
import java.awt.*;

public class BorderUIResource_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.setBounds(50, 50, 100, 30);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.getContentPane().add(button);
        frame.setVisible(true);

        // Call the paintBorder method
        BorderUIResource border = (BorderUIResource) button.getBorder();
        border.paintBorder(frame, frame.getGraphics(), 50, 50, 100, 30);
    }
}
