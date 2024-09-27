import javax.swing.*;
import java.awt.*;

public class BoxLayout_9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);

        frame.setVisible(true);

        // Remove button2 from the layout
        frame.getContentPane().remove(button2);

        // Remove button2 from the layout using BoxLayout's removeLayoutComponent method
        ((BoxLayout) frame.getLayout()).removeLayoutComponent(button2);

        // The button2 is now removed from the layout
    }
}
