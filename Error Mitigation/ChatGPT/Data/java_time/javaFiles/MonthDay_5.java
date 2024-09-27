import java.time.MonthDay;
import java.time.LocalDate;

public class MonthDay_5 {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        LocalDate localDate = monthDay.atYear(2021);
        System.out.println(localDate);
    }
}
