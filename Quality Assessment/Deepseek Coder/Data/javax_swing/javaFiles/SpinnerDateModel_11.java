import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Calendar;
import java.util.Date;

public class SpinnerDateModel_11 {
    public static void main(String[] args) {
        // Create a calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the calendar to the current date
        calendar.setTime(new Date());

        // Create a spinner date model with the calendar
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel(calendar.getTime(), null, null, Calendar.DAY_OF_MONTH);

        // Create a spinner with the spinner date model
        JSpinner spinner = new JSpinner(spinnerDateModel);

        // Set a new value for the spinner
        spinnerDateModel.setValue(new Date());

        // Print the new value of the spinner
        System.out.println("New value: " + spinner.getValue());
    }
}
