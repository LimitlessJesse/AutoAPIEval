import java.util.Locale;

public class Locale_Builder_5 {
    public static void main(String[] args) {
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("en").setRegion("US");
        System.out.println("Before clear: " + builder.build());
        
        builder.clear();
        System.out.println("After clear: " + builder.build());
    }
}
