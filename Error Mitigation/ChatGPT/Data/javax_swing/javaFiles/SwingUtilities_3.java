import javax.swing.SwingUtilities;
import javax.swing.JButton;

public class SwingUtilities_3 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        SwingUtilities.updateComponentTreeUI(button);
    }
}
