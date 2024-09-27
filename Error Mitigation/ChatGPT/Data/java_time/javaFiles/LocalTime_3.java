import java.time.LocalTime;

public class LocalTime_3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 15, 30);
        int second = time.getSecond();
        System.out.println("Second: " + second);
    }
}
