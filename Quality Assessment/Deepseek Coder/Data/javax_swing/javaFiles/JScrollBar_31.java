import javax.swing.JScrollBar;

public class JScrollBar_31 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setMaximum(100);
        int maximum = scrollBar.getMaximum();
        System.out.println("Maximum value of the scrollbar is: " + maximum);
    }
}
