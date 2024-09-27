import java.util.Locale;

public class Locale_Builder_4 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        Locale locale = builder.setVariant("US").build();
        System.out.println("Locale variant: " + locale.getVariant());
    }
}
