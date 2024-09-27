import java.util.Locale;

public class Locale_LanguageRange_5 {
    public static void main(String[] args) {
        Locale.LanguageRange languageRange1 = new Locale.LanguageRange("en", 0.5);
        Locale.LanguageRange languageRange2 = new Locale.LanguageRange("fr", 0.8);

        boolean isEqual = languageRange1.equals(languageRange2);
        System.out.println("Are the language ranges equal? " + isEqual);
    }
}
