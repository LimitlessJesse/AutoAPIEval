import javax.swing.JButton;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_10 {
    public static void main(String[] args) {
        JButton button = new JButton();
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        boolean isEnabled = model.isEnabled();
        System.out.println("Is the button enabled? " + isEnabled);
    }
}
