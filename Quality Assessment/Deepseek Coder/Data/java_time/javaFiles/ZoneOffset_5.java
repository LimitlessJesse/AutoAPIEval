import java.time.ZoneOffset;

public class ZoneOffset_5 {
    public static void main(String[] args) {
        int totalSeconds = ZoneOffset.UTC.getTotalSeconds();
        System.out.println("Total seconds: " + totalSeconds);
    }
}
