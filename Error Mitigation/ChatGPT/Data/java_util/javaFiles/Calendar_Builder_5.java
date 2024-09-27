import java.util.Calendar;
import java.util.Locale;

public class Calendar_Builder_5 {
    public static void main(String[] args) {
        Calendar.Builder builder = new Calendar.Builder();
        Locale locale = new Locale("en", "US");
        builder.setLocale(locale);
        System.out.println("Locale set to: " + builder.toString());
    }
}
