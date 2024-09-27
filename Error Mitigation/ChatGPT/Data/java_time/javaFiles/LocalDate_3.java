import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate_3 {
    public static void main(String[] args) {
        String dateText = "2007-12-03";
        LocalDate parsedDate = LocalDate.parse(dateText, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Parsed LocalDate: " + parsedDate);
    }
}
