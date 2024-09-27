import javax.swing.JButton;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_2 {
    public static void main(String[] args) {
        JButton button = new JButton();
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        model.setArmed(true);
    }
}
