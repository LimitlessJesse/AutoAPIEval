import java.sql.Date;
import java.util.Calendar;

public class Date_3 {
    public static void main(String[] args) {
        Date date = new Date(0);
        date.setTime(System.currentTimeMillis());
        System.out.println(date);
    }
}
