import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_FieldBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setBorder(new BasicBorders.FieldBorder(Color.BLACK, Color.RED, 1));

        frame.add(textField);
        frame.setVisible(true);
    }
}
