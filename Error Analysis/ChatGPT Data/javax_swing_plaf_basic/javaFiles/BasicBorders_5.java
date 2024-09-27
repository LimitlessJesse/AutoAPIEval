import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.Border;
import javax.swing.JTextField;

public class BasicBorders_5 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        Border border = BasicBorders.getTextFieldBorder();
        textField.setBorder(border);
    }
}
