import java.util.Calendar;

public class Calendar_4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Set the current date to 01/01/2022
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println("Original date: " + calendar.getTime());

        // Roll the date up by one day
        calendar.roll(Calendar.DAY_OF_MONTH, true);

        System.out.println("Rolled date: " + calendar.getTime());
    }
}
