import java.util.Calendar;

public class Calendar_1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current Day of Month: " + day);
    }
}
