import javax.swing.JToggleButton;

public class JToggleButton_ToggleButtonModel_5 {
    public static void main(String[] args) {
        JToggleButton.ToggleButtonModel model = new JToggleButton.ToggleButtonModel();
        System.out.println("Default: " + model.isSelected()); // Default is false

        model.setPressed(true);
        System.out.println("After setPressed(true): " + model.isSelected()); // Output will be true
    }
}
