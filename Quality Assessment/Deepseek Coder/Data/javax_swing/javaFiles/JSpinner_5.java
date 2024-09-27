import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_5 {
    public static void main(String[] args) {
        // Create a spinner model with an initial value of 5
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(5, 0, 10, 1);

        // Create a JSpinner and set its model
        JSpinner spinner = new JSpinner(spinnerModel);

        // Set a new value using the setValue(Object value) method
        spinner.setValue(10);

        // Print the new value
        System.out.println("New value: " + spinner.getValue());
    }
}
