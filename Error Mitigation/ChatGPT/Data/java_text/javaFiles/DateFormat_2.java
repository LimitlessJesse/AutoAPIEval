import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormat_2 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getInstance();
        String dateString = "2022-01-01";
        
        try {
            Date parsedDate = dateFormat.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
