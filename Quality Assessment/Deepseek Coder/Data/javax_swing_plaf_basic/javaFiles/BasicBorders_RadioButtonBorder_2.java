import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_RadioButtonBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = new JButton("Button");
        button.setBorder(new BasicBorders.RadioButtonBorder());
        button.addActionListener(e -> System.out.println("Button clicked"));

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
