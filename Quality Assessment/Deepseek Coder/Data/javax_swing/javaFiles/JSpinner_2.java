import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class JSpinner_2 {
    public static void main(String[] args) {
        // Create a SpinnerNumberModel
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);

        // Create a JSpinner with the SpinnerModel
        JSpinner spinner = new JSpinner(spinnerModel);

        // Get the SpinnerModel from the JSpinner
        SpinnerModel model = spinner.getModel();

        // Print the SpinnerModel
        System.out.println(model);
    }
}
