import javax.swing.DefaultButtonModel;
import javax.swing.JButton;

public class DefaultButtonModel_7 {
    public static void main(String[] args) {
        JButton button = new JButton();
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        model.setSelected(true);
        System.out.println("Button is selected: " + model.isSelected());
    }
}
