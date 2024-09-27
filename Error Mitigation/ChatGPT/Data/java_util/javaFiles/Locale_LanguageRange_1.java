import java.util.Locale;

public class Locale_LanguageRange_1 {
    public static void main(String[] args) {
        Locale.LanguageRange languageRange = Locale.LanguageRange.parse("en-US");
        String range = languageRange.getRange();
        System.out.println("Language Range: " + range);
    }
}
