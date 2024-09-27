import java.util.Date;

public class Date_2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date: " + date);

        long timeInMillis = 1000000000; // 1 billion milliseconds
        date.setTime(timeInMillis);
        System.out.println("Date after setting time: " + date);
    }
}
