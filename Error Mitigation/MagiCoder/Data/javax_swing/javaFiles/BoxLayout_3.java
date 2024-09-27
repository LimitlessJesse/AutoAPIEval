import javax.swing.*;
import java.awt.*;

public class BoxLayout_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.getContentPane().setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        layout.addLayoutComponent(button1, "Button 1");
        layout.addLayoutComponent(button2, "Button 2");

        frame.setVisible(true);
    }
}
