import java.text.DateFormat;
import java.util.Date;

public class DateFormat_4 {
    public static void main(String[] args) {
        // Create a Date instance
        Date currentDate = new Date();
        
        // Get a DateFormat instance for the default locale with the specified style
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        
        // Format the date and print it
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
