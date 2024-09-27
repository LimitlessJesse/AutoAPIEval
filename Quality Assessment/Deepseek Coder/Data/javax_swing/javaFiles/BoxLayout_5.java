import javax.swing.*;
import java.awt.*;

public class BoxLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        BoxLayout layout = (BoxLayout) panel.getLayout();
        float alignmentY = layout.getLayoutAlignmentY(button1);

        System.out.println("The vertical alignment of button1 is: " + alignmentY);
    }
}
