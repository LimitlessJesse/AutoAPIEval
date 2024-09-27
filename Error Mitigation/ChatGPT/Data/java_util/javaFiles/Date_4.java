import java.util.Date;

public class Date_4 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() + 1000); // Adding 1 second to current time
        
        boolean isAfter = date1.after(date2);
        System.out.println("Is date1 after date2? " + isAfter);
    }
}
