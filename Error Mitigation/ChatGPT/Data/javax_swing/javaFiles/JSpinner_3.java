import javax.swing.JSpinner;
import javax.swing.SpinnerModel;

public class JSpinner_3 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        SpinnerModel model = spinner.getModel();
        spinner.setModel(model);
    }
}
