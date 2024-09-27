import java.util.Locale;

public class Locale_Builder_5 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        builder.setExtension('x', "testing");
        Locale locale = builder.build();

        System.out.println(locale.toLanguageTag());
    }
}
