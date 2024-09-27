import javax.swing.JToggleButton;
import javax.swing.JToggleButton.ToggleButtonModel;

public class JToggleButton_ToggleButtonModel_20 {
    public static void main(String[] args) {
        JToggleButton button = new JToggleButton();
        ToggleButtonModel model = button.getModel();
        model.setSelected(true);
    }
}
