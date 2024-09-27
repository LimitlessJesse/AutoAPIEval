import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;

public class JapaneseChronology_1 {
    public static void main(String[] args) {
        JapaneseChronology chronology = JapaneseChronology.INSTANCE;
        JapaneseDate japaneseDate = chronology.date(2022, 10, 15);
        System.out.println("Japanese Date: " + japaneseDate);
    }
}
