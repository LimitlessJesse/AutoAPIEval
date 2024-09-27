import java.time.LocalTime;

public class LocalTime_5 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalTime newTime = currentTime.plusHours(3);
        System.out.println("Time after adding 3 hours: " + newTime);
    }
}
