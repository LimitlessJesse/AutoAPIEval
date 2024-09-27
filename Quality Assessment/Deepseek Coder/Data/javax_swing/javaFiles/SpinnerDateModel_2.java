import javax.swing.SpinnerDateModel;
import java.util.Calendar;
import java.util.Date;

public class SpinnerDateModel_2 {
    public static void main(String[] args) {
        // Create a new SpinnerDateModel
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel();

        // Get the date from the SpinnerDateModel
        Date date = spinnerDateModel.getDate();

        // Print the date
        System.out.println(date);
    }
}
