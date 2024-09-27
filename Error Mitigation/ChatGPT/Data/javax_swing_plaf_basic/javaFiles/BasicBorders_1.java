import javax.swing.plaf.basic.BasicBorders;
import javax.swing.border.Border;

public class BasicBorders_1 {
    public static void main(String[] args) {
        Border buttonBorder = BasicBorders.getButtonBorder();
        System.out.println(buttonBorder);
    }
}
