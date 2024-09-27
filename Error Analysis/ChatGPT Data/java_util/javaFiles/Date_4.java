import java.util.Date;

public class Date_4 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date specifiedDate = new Date(2021, 10, 10); // Create a specified date instance
        
        boolean isBefore = specifiedDate.before(currentDate);
        
        System.out.println("Is the specified date before the current date? " + isBefore);
    }
}
