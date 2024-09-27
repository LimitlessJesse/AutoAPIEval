import java.util.Locale;

public class Locale_Builder_2 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        Locale locale = builder.setLanguage("en").build();
        System.out.println("Language: " + locale.getLanguage());
    }
}
