import javax.swing.JButton;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_46 {
    public static void main(String[] args) {
        JButton button = new JButton();
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        System.out.println(model.isSelected());
    }
}
