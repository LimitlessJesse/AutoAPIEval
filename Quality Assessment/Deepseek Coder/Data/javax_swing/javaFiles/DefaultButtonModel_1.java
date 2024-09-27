import javax.swing.DefaultButtonModel;
import javax.swing.JButton;

public class DefaultButtonModel_1 {
    public static void main(String[] args) {
        JButton button = new JButton();
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        model.setArmed(true);
        System.out.println("Is the button armed? " + model.isArmed());
    }
}
