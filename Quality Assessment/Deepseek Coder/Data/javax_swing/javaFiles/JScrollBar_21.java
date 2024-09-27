import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class JScrollBar_21 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setOrientation(SwingConstants.VERTICAL);
        int orientation = scrollBar.getOrientation();
        if (orientation == SwingConstants.VERTICAL) {
            System.out.println("Vertical orientation");
        } else if (orientation == SwingConstants.HORIZONTAL) {
            System.out.println("Horizontal orientation");
        } else {
            System.out.println("Unknown orientation");
        }
    }
}
