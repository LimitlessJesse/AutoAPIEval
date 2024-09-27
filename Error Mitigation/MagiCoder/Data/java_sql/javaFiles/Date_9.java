import java.sql.Date;
import java.util.Calendar;

public class Date_9 {
    public static void main(String[] args) {
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(utilDate);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hours: " + hours);
    }
}
