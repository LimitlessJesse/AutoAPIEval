import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinner_12 {
    public static void main(String[] args) {
        // Create a spinner
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        // Create a change listener
        ChangeListener listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Spinner value changed: " + spinner.getValue());
            }
        };

        // Add the change listener to the spinner
        spinner.addChangeListener(listener);

        // Change the spinner value
        spinner.setValue(50);

        // Remove the change listener from the spinner
        spinner.removeChangeListener(listener);

        // Change the spinner value again
        spinner.setValue(75);
    }
}
