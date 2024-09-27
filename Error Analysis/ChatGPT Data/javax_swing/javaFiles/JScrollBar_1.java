import javax.swing.JScrollBar;

public class JScrollBar_1 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        int orientation = scrollBar.getOrientation();
        System.out.println("Scroll bar orientation: " + orientation);
    }
}
