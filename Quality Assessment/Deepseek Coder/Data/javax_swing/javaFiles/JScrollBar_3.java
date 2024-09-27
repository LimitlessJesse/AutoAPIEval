import javax.swing.JScrollBar;

public class JScrollBar_3 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setMinimum(10);
        scrollBar.setValue(5);
        int min = scrollBar.getMinimum();
        System.out.println("Minimum value of scrollbar: " + min);
    }
}
