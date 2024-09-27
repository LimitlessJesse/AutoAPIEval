import java.util.Locale;

public class Locale_Builder_1 {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder().setLanguage("en").build();
        System.out.println(locale.getLanguage());
    }
}
