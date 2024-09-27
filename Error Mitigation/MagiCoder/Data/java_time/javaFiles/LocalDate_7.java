import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDate_7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Today is: " + dayOfWeek);
    }
}
