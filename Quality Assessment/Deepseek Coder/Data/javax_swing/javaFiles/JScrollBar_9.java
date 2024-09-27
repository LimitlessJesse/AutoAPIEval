import javax.swing.JScrollBar;

public class JScrollBar_9 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setValues(50, 100, 1);
        int min = scrollBar.getMinimum();
        int max = scrollBar.getMaximum();
        int visibleAmount = max - min;
        System.out.println("Visible Amount: " + visibleAmount);
    }
}
