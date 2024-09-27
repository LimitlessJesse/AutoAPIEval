import java.time.chrono.JapaneseEra;
import java.time.format.TextStyle;
import java.util.Locale;

public class JapaneseEra_2 {
    public static void main(String[] args) {
        JapaneseEra era = JapaneseEra.HEISEI;
        String displayName = era.getDisplayName(TextStyle.FULL, Locale.JAPAN);
        System.out.println("Japanese Era: " + displayName);
    }
}
