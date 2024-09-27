import java.util.Date;

public class Date_3 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date: " + date);

        // Using setTime method
        date.setTime(1622031530000L); // Setting time to May 26, 2021 15:25:30 UTC
        
        System.out.println("Updated Date: " + date);
    }
}
