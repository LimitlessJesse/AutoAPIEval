import java.util.Locale;

public class Locale_Builder_3 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        builder.setScript("Latn");
        Locale locale = builder.build();
        System.out.println(locale.getScript());
    }
}
