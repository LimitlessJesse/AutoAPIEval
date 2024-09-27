import java.util.Locale;

public class Locale_LanguageRange_3 {
    public static void main(String[] args) {
        Locale.LanguageRange languageRange = Locale.LanguageRange.parse("en-US");
        int hashCode = languageRange.hashCode();
        System.out.println("Hash code for language range: " + hashCode);
    }
}
