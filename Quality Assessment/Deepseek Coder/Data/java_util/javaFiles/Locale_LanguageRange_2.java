import java.util.Locale;

public class Locale_LanguageRange_2 {
    public static void main(String[] args) {
        Locale.LanguageRange[] ranges = Locale.LanguageRange.parse("en;q=0.8, fr;q=0.6");
        Locale.LanguageRange range = ranges[0];
        System.out.println(range.getRange());
    }
}
