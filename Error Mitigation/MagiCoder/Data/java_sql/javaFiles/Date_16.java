import java.sql.Date;
import java.util.Calendar;

public class Date_16 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date);
    }
}
