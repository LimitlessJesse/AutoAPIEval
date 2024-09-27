import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_FieldBorder_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField(20);
        textField.setBorder(new BasicBorders.FieldBorder(Color.BLACK, true));

        frame.getContentPane().add(textField);
        frame.setVisible(true);
    }
}
