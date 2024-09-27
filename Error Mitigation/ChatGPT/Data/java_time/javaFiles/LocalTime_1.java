import java.time.LocalTime;

public class LocalTime_1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 15, 30);
        int hour = time.getHour();
        System.out.println("Hour: " + hour);
    }
}
