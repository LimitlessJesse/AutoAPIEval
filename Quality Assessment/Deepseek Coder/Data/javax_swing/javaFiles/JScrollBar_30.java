import javax.swing.JScrollBar;

public class JScrollBar_30 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setMaximum(100);
        System.out.println("Maximum value of scrollbar: " + scrollBar.getMaximum());
    }
}
