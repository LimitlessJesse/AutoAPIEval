import java.util.Locale;

public class Locale_Builder_3 {
    public static void main(String[] args) {

        Locale.Builder builder = new Locale.Builder();
        Locale locale = builder.setRegion("US").build();

        System.out.println("Locale with region set: " + locale);
    }
}
