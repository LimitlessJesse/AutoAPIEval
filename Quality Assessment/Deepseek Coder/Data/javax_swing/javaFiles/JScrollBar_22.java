import javax.swing.JScrollBar;

public class JScrollBar_22 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setUnitIncrement(10);
        System.out.println("Unit Increment: " + scrollBar.getUnitIncrement());
    }
}
