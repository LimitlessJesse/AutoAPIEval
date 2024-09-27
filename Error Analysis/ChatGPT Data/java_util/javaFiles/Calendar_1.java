import java.util.Calendar;
import java.util.Date;

public class Calendar_1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);
        System.out.println("Calendar set to: " + calendar.getTime());
    }
}
