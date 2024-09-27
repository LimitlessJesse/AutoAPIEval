import java.util.TimeZone;

public class TimeZone_3 {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs) {
            System.out.println(id);
        }
    }
}
