import javax.swing.plaf.basic.BasicBorders;
import java.awt.Component;
import java.awt.Insets;

public class BasicBorders_SplitPaneBorder_1 {
    public static void main(String[] args) {
        BasicBorders.SplitPaneBorder splitPaneBorder = new BasicBorders.SplitPaneBorder();
        Component component = new Component() {}; // Create a dummy component for testing
        Insets insets = splitPaneBorder.getBorderInsets(component);
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
