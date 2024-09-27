import java.util.Locale;

public class Locale_Builder_1 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("en");
        Locale locale = builder.build();
        System.out.println("Language: " + locale.getLanguage());
    }
}
