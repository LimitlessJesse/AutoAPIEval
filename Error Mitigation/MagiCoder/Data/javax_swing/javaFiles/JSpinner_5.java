import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_5 {
    public static void main(String[] args) {
        // Create a SpinnerNumberModel with an initial value of 5
        SpinnerNumberModel model = new SpinnerNumberModel(5, 0, 10, 1);

        // Create a JSpinner and set the model
        JSpinner spinner = new JSpinner(model);

        // Set the value of the model to 7
        spinner.setValue(7);

        // Print the current value of the model
        System.out.println("Current value: " + model.getValue());
    }
}
