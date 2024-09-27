import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_RadioButtonBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button");
        button.setBorder(new BasicBorders.RadioButtonBorder());

        frame.add(button);
        frame.setVisible(true);
    }
}
