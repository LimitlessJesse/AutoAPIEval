import javax.swing.AbstractButton;
import javax.swing.JButton;

public class AbstractButton_10 {
    public static void main(String[] args) {
        AbstractButton button = new JButton();
        boolean isFilled = button.isContentAreaFilled();
        System.out.println("Is content area filled: " + isFilled);
    }
}
