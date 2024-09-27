import java.util.Date;

public class Date_3 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() + 1000); // Creating a date 1 second ahead of the current time
        
        boolean isBefore = date1.before(date2);
        System.out.println("Is date1 before date2? " + isBefore);
    }
}
