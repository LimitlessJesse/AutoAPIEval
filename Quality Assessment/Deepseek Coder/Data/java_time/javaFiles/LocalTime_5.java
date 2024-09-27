import java.time.LocalTime;

public class LocalTime_5 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour > 12) {
            hour = hour - 12;
        }
        System.out.println("Current Hour: " + hour);
    }
}
