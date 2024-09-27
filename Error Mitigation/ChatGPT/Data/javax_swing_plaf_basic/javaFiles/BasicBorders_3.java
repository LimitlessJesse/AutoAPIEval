import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.Border;

public class BasicBorders_3 {
    public static void main(String[] args) {
        Border radioButtonBorder = BasicBorders.getRadioButtonBorder();
        System.out.println("RadioButton Border: " + radioButtonBorder);
    }
}
