import javax.swing.SpinnerDateModel;
import java.util.Calendar;
import java.util.Date;

public class SpinnerDateModel_12 {
    public static void main(String[] args) {
        // Create a SpinnerDateModel
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel();

        // Get the current date
        Date currentDate = new Date();

        // Set the current date to the SpinnerDateModel
        spinnerDateModel.setValue(currentDate);

        // Get the value from the SpinnerDateModel
        Date date = (Date) spinnerDateModel.getValue();

        // Print the date
        System.out.println(date);
    }
}
