import javax.swing.border.CompoundBorder;
import javax.swing.border.Border;

public class CompoundBorder_2 {
    public static void main(String[] args) {
        CompoundBorder compoundBorder = new CompoundBorder();
        Border outsideBorder = compoundBorder.getOutsideBorder();
        System.out.println("Outside Border: " + outsideBorder);
    }
}
