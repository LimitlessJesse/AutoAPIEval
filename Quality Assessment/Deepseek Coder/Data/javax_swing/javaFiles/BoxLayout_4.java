import javax.swing.*;
import java.awt.*;

public class BoxLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        float alignmentX = BoxLayout.getLayoutAlignmentX(button1);
        System.out.println("Alignment of button1 in X direction: " + alignmentX);

        alignmentX = BoxLayout.getLayoutAlignmentX(button2);
        System.out.println("Alignment of button2 in X direction: " + alignmentX);

        frame.setVisible(true);
    }
}
