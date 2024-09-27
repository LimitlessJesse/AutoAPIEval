import javax.swing.JButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_45 {
    public static void main(String[] args) {
        JButton button = new JButton();
        ButtonModel model = button.getModel();
        if (model instanceof DefaultButtonModel) {
            DefaultButtonModel defaultModel = (DefaultButtonModel) model;
            defaultModel.setSelected(true);
        }
    }
}
