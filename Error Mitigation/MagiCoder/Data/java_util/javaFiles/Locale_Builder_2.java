import java.util.Locale;

public class Locale_Builder_2 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        builder.setRegion("US");
        Locale locale = builder.build();
        System.out.println(locale);
    }
}
