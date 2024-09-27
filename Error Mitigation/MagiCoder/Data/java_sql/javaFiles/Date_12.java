import java.sql.Date;
import java.util.Calendar;

public class Date_12 {
    public static void main(String[] args) {
        // Get current date
        Date currentDate = new Date(Calendar.getInstance().getTime().getTime());
        System.out.println("Current date: " + currentDate);

        // Get year, month and day
        int year = currentDate.getYear() + 1900;
        int month = currentDate.getMonth() + 1;
        int day = currentDate.getDate();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
