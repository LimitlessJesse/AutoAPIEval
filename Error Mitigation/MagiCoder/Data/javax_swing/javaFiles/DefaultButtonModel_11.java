import javax.swing.DefaultButtonModel;
import javax.swing.JButton;

public class DefaultButtonModel_11 {
    public static void main(String[] args) {
        JButton button = new JButton("Button");
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        model.setMnemonic('B');
    }
}
