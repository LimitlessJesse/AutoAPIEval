import java.util.Calendar;

public class Calendar_3 {
    public static void main(String[] args) {
        // Create a new calendar instance
        Calendar calendar = Calendar.getInstance();

        // Print the current date
        System.out.println("Current date: " + calendar.getTime());

        // Add 5 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 5);

        // Print the new date after adding 5 days
        System.out.println("New date after adding 5 days: " + calendar.getTime());
    }
}
