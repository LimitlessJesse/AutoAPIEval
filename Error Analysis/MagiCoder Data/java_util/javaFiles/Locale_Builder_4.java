import java.util.Locale;

public class Locale_Builder_4 {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder()
               .setLanguage("en")
               .setRegion("US")
               .setVariant("POSIX")
               .build();

        System.out.println(locale);
    }
}
