import java.time.LocalDate;
import java.time.DayOfWeek;

public class LocalDate_6 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
