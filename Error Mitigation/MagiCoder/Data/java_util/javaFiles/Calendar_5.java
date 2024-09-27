import java.util.Calendar;
import java.util.Date;

public class Calendar_5 {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Get the current date and time
        Date currentDate = calendar.getTime();

        // Print the current date and time
        System.out.println("Current Date and Time: " + currentDate);
    }
}
