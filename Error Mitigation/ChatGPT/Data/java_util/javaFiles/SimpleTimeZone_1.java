import java.util.SimpleTimeZone;
import java.util.Calendar;

public class SimpleTimeZone_1 {
    public static void main(String[] args) {
        SimpleTimeZone timeZone = new SimpleTimeZone();
        timeZone.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2*60*60*1000);
    }
}
