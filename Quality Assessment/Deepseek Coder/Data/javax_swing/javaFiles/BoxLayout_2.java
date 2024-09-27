import javax.swing.*;
import java.awt.*;

public class BoxLayout_2 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a BoxLayout
        BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.getContentPane().setLayout(layout);

        // Create a JButton
        JButton button = new JButton("Button");

        // Add the JButton to the layout
        frame.getContentPane().add(button);

        // Display the JFrame
        frame.pack();
        frame.setVisible(true);
    }
}
