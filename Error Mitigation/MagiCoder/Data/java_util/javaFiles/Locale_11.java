import java.util.Locale;

public class Locale_11 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US", "WIN");
        String variant = locale.getVariant();
        System.out.println("Variant: " + variant);
    }
}
