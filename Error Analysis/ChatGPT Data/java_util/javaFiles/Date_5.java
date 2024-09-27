import java.util.Date;

public class Date_5 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date futureDate = new Date(currentDate.getTime() + 86400000); // Adding 1 day in milliseconds

        boolean isAfter = futureDate.after(currentDate);
        System.out.println("Is futureDate after currentDate? " + isAfter);
    }
}
