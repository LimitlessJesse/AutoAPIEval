import javax.swing.border.CompoundBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class CompoundBorder_1 {
    public static void main(String[] args) {
        // Create an EmptyBorder and LineBorder
        Border emptyBorder = new EmptyBorder(10, 10, 10, 10);
        Border lineBorder = new LineBorder(Color.BLACK, 2);

        // Create a CompoundBorder with EmptyBorder inside LineBorder
        CompoundBorder compoundBorder = new CompoundBorder(lineBorder, emptyBorder);

        // Get the inside border
        Border insideBorder = compoundBorder.getInsideBorder();

        // Print the inside border
        System.out.println("Inside Border: " + insideBorder);
    }
}
