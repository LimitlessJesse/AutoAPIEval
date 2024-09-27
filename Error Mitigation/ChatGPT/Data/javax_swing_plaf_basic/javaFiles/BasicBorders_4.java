import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.Border;

public class BasicBorders_4 {
    public static void main(String[] args) {
        Border textFieldBorder = BasicBorders.getTextFieldBorder();
        System.out.println("Text field border: " + textFieldBorder);
    }
}
