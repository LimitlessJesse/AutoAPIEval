import java.time.LocalTime;

public class LocalTime_5 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 15, 30);
        LocalTime newTime = time.minusMinutes(5);
        System.out.println("Original Time: " + time);
        System.out.println("Time after subtracting 5 minutes: " + newTime);
    }
}
