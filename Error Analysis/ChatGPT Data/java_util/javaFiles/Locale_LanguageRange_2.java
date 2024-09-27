import java.util.Locale;

public class Locale_LanguageRange_2 {
    public static void main(String[] args) {
        Locale.LanguageRange languageRange = new Locale.LanguageRange("en", 0.5);
        double weight = languageRange.getWeight();
        System.out.println("Weight: " + weight);
    }
}
