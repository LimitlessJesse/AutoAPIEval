import java.time.LocalTime;

public class LocalTime_3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        
        System.out.println("Current Hour: " + hour);
    }
}
