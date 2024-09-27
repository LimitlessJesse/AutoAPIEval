import java.time.MonthDay;
import java.time.Month;

public class MonthDay_2 {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        Month month = monthDay.getMonth();
        System.out.println("Month: " + month);
    }
}
