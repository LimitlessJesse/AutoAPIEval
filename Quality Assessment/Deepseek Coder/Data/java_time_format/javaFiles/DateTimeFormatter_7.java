import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatter_7 {
    public static void main(String[] args) {
        // Create a date-time object
        LocalDateTime now = LocalDateTime.now();

        // Create a formatter with default locale
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        System.out.println("Default locale: " + now.format(formatter));

        // Create a formatter with specific locale
        Locale locale = new Locale("fr", "FR");
        DateTimeFormatter formatterFR = formatter.withLocale(locale);
        System.out.println("French locale: " + now.format(formatterFR));
    }
}
