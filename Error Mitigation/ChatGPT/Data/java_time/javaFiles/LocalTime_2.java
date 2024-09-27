import java.time.LocalTime;

public class LocalTime_2 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 15, 30);
        int minute = time.getMinute();
        System.out.println("Minute: " + minute);
    }
}
