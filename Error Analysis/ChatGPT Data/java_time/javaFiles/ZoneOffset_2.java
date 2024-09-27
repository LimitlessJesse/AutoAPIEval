import java.time.ZoneOffset;

public class ZoneOffset_2 {
    public static void main(String[] args) {
        ZoneOffset offset1 = ZoneOffset.ofHours(2);
        ZoneOffset offset2 = ZoneOffset.ofHours(3);
        
        int result = offset1.compareTo(offset2);
        System.out.println("Comparison Result: " + result);
    }
}
