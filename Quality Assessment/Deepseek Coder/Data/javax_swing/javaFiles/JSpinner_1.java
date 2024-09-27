import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_1 {
    public static void main(String[] args) {
        // Create a JSpinner
        JSpinner spinner = new JSpinner();

        // Create a SpinnerNumberModel
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);

        // Set the model on the spinner
        spinner.setModel(spinnerModel);
    }
}
