import javax.swing.SpinnerDateModel;
import java.util.Calendar;

public class SpinnerDateModel_4 {
    public static void main(String[] args) {
        SpinnerDateModel model = new SpinnerDateModel();
        model.setCalendarField(Calendar.MONTH);
        System.out.println("Calendar field set to: " + model.getCalendarField());
    }
}
