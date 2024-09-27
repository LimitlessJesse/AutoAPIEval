import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class JapaneseDate_4 {
    public static void main(String[] args) {
        JapaneseDate date = JapaneseDate.now();
        JapaneseDate newDate = date.plus(1, ChronoUnit.DAYS);
        System.out.println("Original Date: " + date);
        System.out.println("New Date after adding 1 day: " + newDate);
    }
}
