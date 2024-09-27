import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class TitledBorder_23 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        Border border = BorderFactory.createTitledBorder("My Button");
        button.setBorder(border);
    }
}
