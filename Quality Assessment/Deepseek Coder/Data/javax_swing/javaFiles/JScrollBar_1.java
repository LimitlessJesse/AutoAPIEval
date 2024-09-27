import javax.swing.JScrollBar;
import javax.swing.JFrame;

public class JScrollBar_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollBar scrollBar = new JScrollBar();

        frame.add(scrollBar);
        frame.setSize(300, 200);
        frame.setVisible(true);

        int value = scrollBar.getValue();
        System.out.println("The current value of the scrollbar is: " + value);
    }
}
