import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;

public class JapaneseChronology_3 {
    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseChronology.INSTANCE.date(2022, 12, 31);
        System.out.println("Japanese Date: " + japaneseDate);
    }
}
