import javax.swing.DefaultButtonModel;
import javax.swing.JButton;

public class DefaultButtonModel_9 {
    public static void main(String[] args) {
        JButton button = new JButton();
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        model.setEnabled(false);
    }
}
