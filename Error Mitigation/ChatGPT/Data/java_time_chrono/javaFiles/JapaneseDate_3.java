import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

public class JapaneseDate_3 {
    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseDate.now();
        JapaneseEra era = japaneseDate.getEra();
        System.out.println("Era applicable at this date: " + era);
    }
}
