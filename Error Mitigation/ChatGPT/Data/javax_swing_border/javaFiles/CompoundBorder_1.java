import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class CompoundBorder_1 {
    public static void main(String[] args) {
        Border insideBorder = new CompoundBorder().getInsideBorder();
        System.out.println("Inside Border: " + insideBorder);
    }
}
