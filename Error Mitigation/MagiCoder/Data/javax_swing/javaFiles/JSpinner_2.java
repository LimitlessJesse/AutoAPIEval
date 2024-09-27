import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class JSpinner_2 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        SpinnerModel model = new SpinnerNumberModel(5, 0, 10, 1);
        spinner.setModel(model);
    }
}
