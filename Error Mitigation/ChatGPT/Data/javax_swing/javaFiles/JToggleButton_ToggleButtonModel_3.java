import javax.swing.JToggleButton;

public class JToggleButton_ToggleButtonModel_3 {
    public static void main(String[] args) {
        JToggleButton.ToggleButtonModel model = new JToggleButton.ToggleButtonModel();
        model.setPressed(true);
        System.out.println("Is button pressed: " + model.isPressed());
    }
}
