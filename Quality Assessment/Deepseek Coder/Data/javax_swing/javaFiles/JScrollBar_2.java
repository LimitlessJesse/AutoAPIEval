import javax.swing.JScrollBar;

public class JScrollBar_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setValue(50);
        System.out.println("The value of the scrollbar is: " + scrollBar.getValue());
    }
}
