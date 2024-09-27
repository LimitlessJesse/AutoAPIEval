import javax.swing.JScrollBar;

public class JScrollBar_1 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setValues(50, 10, 0, 100);
        System.out.println("Value: " + scrollBar.getValue());
        System.out.println("Extent: " + scrollBar.getVisibleAmount());
        System.out.println("Minimum: " + scrollBar.getMinimum());
        System.out.println("Maximum: " + scrollBar.getMaximum());
    }
}
