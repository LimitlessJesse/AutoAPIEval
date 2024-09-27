import java.util.Calendar;

public class Calendar_2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 11); // Month starts from 0 (January is 0)
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println("Date: " + calendar.getTime());
    }
}
