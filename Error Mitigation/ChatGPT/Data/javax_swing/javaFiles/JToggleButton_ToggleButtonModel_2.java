import javax.swing.JToggleButton.ToggleButtonModel;

public class JToggleButton_ToggleButtonModel_2 {
    public static void main(String[] args) {
        ToggleButtonModel model = new ToggleButtonModel();
        boolean selected = model.isSelected();
        System.out.println("Is button selected: " + selected);
    }
}
