import java.util.Calendar;

public class Calendar_3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        // Set the year to 2022
        calendar.set(Calendar.YEAR, 2022);
        
        // Set the month to January (Note: January is represented as 0)
        calendar.set(Calendar.MONTH, 0);
        
        // Set the day of the month to 15
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        
        // Print the updated calendar
        System.out.println(calendar.getTime());
    }
}
