import javax.swing.SpinnerDateModel;
import java.util.Calendar;

public class SpinnerDateModel_5 {
    public static void main(String[] args) {
        SpinnerDateModel model = new SpinnerDateModel();
        model.setCalendarField(Calendar.MONTH);
    }
}
