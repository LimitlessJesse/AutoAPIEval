import javax.swing.*;
import java.awt.*;

public class BoxLayout_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        frame.setVisible(true);

        Dimension maxLayoutSize = BoxLayout.maximumLayoutSize(frame.getContentPane());
        System.out.println("Maximum Layout Size: " + maxLayoutSize);
    }
}
