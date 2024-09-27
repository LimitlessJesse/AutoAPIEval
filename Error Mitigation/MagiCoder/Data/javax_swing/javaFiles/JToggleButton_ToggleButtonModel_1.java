import javax.swing.JToggleButton;
import javax.swing.JToggleButton.ToggleButtonModel;

public class JToggleButton_ToggleButtonModel_1 {
    public static void main(String[] args) {
        JToggleButton button = new JToggleButton();
        ToggleButtonModel model = button.getModel();
        boolean isSelected = model.isSelected();
        System.out.println("Is the button selected? " + isSelected);
    }
}
