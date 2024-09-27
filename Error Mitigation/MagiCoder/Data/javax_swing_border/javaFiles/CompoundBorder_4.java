import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class CompoundBorder_4 {
    public static void main(String[] args) {
        Border insideBorder = new EmptyBorder(10, 10, 10, 10);
        Border outsideBorder = new EmptyBorder(20, 20, 20, 20);
        CompoundBorder compoundBorder = new CompoundBorder(outsideBorder, insideBorder);

        boolean isOpaque = compoundBorder.isBorderOpaque();
        System.out.println("Is the compound border opaque? " + isOpaque);
    }
}
