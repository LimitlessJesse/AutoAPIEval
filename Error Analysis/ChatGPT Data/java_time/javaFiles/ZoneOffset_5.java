import java.time.ZoneOffset;

public class ZoneOffset_5 {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.UTC;
        String offsetString = offset.toString();
        System.out.println("Zone Offset: " + offsetString);
    }
}
