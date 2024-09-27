import java.util.Locale;

public class Locale_Builder_4 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        builder.setExtension('u', "ca-japanese");
        Locale locale = builder.build();
        System.out.println(locale.toLanguageTag());
    }
}
