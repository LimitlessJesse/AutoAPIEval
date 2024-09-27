import java.text.DateFormat;
import java.util.Calendar;

public class DateFormat_3 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getInstance();
        dateFormat.setLenient(true);
        System.out.println("Lenient parsing is set to: " + dateFormat.isLenient());
    }
}
