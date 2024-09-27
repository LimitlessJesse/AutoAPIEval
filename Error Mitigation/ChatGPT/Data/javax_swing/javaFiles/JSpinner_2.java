import javax.swing.JSpinner;
import javax.swing.SpinnerModel;

public class JSpinner_2 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        SpinnerModel model = spinner.getModel();
        
        // Set a new value for the spinner
        Object value = 10;
        model.setValue(value);
        
        // Display the current value of the spinner
        System.out.println(model.getValue());
    }
}
