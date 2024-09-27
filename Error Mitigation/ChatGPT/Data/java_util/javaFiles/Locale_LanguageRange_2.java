import java.util.Locale;

public class Locale_LanguageRange_2 {
    public static void main(String[] args) {
        Locale.LanguageRange languageRange = Locale.LanguageRange.parse("en;q=0.8");
        double weight = languageRange.getWeight();
        System.out.println("Weight of Language Range: " + weight);
    }
}
