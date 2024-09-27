import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;

public class JapaneseChronology_5 {
    public static void main(String[] args) {
        JapaneseDate date = JapaneseChronology.INSTANCE.dateNow();
        System.out.println("Today's Japanese date: " + date);
    }
}
