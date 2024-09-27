import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;

public class JapaneseChronology_4 {
    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseChronology.INSTANCE.dateNow();
        System.out.println("Current Japanese Date: " + japaneseDate);
    }
}
