import java.time.MonthDay;

public class MonthDay_2 {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(2, 29);
        int dayOfMonth = monthDay.getDayOfMonth();
        System.out.println("Day of Month: " + dayOfMonth);
    }
}
