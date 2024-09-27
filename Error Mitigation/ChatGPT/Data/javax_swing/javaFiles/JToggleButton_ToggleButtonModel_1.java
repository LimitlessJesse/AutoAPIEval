import javax.swing.JToggleButton;

public class JToggleButton_ToggleButtonModel_1 {
    public static void main(String[] args) {
        JToggleButton.ToggleButtonModel model = new JToggleButton.ToggleButtonModel();
        model.setSelected(true);
        System.out.println("Is selected: " + model.isSelected());
    }
}
