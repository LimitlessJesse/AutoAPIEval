import java.time.LocalTime;

public class LocalTime_4 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 15, 30);
        LocalTime newTime = time.plusHours(2);
        System.out.println("Original Time: " + time);
        System.out.println("Time after adding 2 hours: " + newTime);
    }
}
