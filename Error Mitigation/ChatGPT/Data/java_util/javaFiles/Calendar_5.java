import java.util.Calendar;

public class Calendar_5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date: " + calendar.getTime());

        // Roll the current date up by one day
        calendar.roll(Calendar.DATE, true);
        System.out.println("Rolled date: " + calendar.getTime());
    }
}
