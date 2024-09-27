import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class JSeparator_3 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        int orientation = separator.getOrientation();
        System.out.println("Orientation: " + (orientation == SwingConstants.VERTICAL? "Vertical" : "Horizontal"));
    }
}
