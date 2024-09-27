import java.sql.Date;

public class Date_2 {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Current Date: " + date);
        
        long newTime = System.currentTimeMillis() + 86400000; // Adding 24 hours in milliseconds
        date.setTime(newTime);
        System.out.println("Date after adding 24 hours: " + date);
    }
}
