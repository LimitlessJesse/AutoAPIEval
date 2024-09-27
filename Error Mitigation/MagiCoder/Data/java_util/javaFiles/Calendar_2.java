import java.util.Calendar;

public class Calendar_2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.JANUARY, 1);
        System.out.println(calendar.getTime());
    }
}
