import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatter_5 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy").withLocale(Locale.US);
        String formattedDate = formatter.format(LocalDate.now());
        System.out.println("Formatted Date: " + formattedDate);
    }
}
