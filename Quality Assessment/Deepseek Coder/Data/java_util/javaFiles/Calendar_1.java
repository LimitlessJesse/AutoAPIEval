import java.util.Calendar;

public class Calendar_1 {
    public static void main(String[] args) {
        // Create a new calendar instance
        Calendar calendar = Calendar.getInstance();

        // Get the day of the month
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Get the hour of the day
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        // Print the values
        System.out.println("Day of the month: " + dayOfMonth);
        System.out.println("Hour of the day: " + hourOfDay);
    }
}
