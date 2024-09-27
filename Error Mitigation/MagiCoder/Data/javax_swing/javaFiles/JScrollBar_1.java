import javax.swing.JScrollBar;

public class JScrollBar_1 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setValue(50); // Set the value of the scrollbar
        int value = scrollBar.getValue(); // Get the value of the scrollbar
        System.out.println("The value of the scrollbar is: " + value);
    }
}
