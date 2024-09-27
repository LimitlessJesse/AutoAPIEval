import java.time.chrono.JapaneseEra;
import java.time.format.TextStyle;
import java.util.Locale;

public class JapaneseEra_4 {
    public static void main(String[] args) {
        JapaneseEra era = JapaneseEra.of(4); // Reiwa era
        String displayName = era.getDisplayName(TextStyle.FULL, Locale.JAPANESE);
        System.out.println("Japanese Era Full Display Name: " + displayName);
    }
}
