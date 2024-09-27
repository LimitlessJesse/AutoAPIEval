import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Calendar;

public class SpinnerDateModel_4 {
    public static void main(String[] args) {
        SpinnerDateModel model = new SpinnerDateModel();
        JSpinner spinner = new JSpinner(model);

        // Change the calendar field
        model.setCalendarField(Calendar.MONTH);
    }
}
