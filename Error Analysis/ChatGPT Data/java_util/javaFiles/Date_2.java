import java.util.Date;

public class Date_2 {
    public static void main(String[] args) {
        Date date = new Date();
        long timeInMillis = date.getTime();
        System.out.println("Current time in milliseconds: " + timeInMillis);
    }
}
