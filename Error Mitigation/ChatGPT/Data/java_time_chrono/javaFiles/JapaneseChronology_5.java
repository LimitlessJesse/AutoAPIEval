import java.time.Clock;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;

public class JapaneseChronology_5 {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        JapaneseDate japaneseDate = JapaneseChronology.INSTANCE.dateNow(clock);
        System.out.println("Current Japanese Date: " + japaneseDate);
    }
}
