import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_6 {
    public static void main(String[] args) {
        // Create a spinner with a number model
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner spinner = new JSpinner(model);

        // Set the value of the spinner
        spinner.getValue();

        // Get the value of the spinner
        int value = (Integer) spinner.getValue();
        System.out.println("The value of the spinner is: " + value);
    }
}
