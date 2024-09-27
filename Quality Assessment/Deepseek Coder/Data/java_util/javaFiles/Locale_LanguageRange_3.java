import java.util.Locale;

public class Locale_LanguageRange_3 {
    public static void main(String[] args) {
        Locale.LanguageRange range1 = new Locale.LanguageRange("en");
        Locale.LanguageRange range2 = new Locale.LanguageRange("en");

        boolean isEqual = range1.equals(range2);

        System.out.println("Are the two LanguageRange objects equal? " + isEqual);
    }
}
