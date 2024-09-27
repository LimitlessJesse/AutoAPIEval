import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

public class JapaneseChronology_3 {
    public static void main(String[] args) {
        JapaneseChronology chronology = JapaneseChronology.INSTANCE;
        JapaneseEra era = JapaneseEra.HEISEI;
        int yearOfEra = 1;
        int month = 1;
        int dayOfMonth = 8;
        
        JapaneseDate japaneseDate = chronology.date(era, yearOfEra, month, dayOfMonth);
        System.out.println("Japanese Date: " + japaneseDate);
    }
}
