import java.time.ZoneOffset;

public class ZoneOffset_2 {
    public static void main(String[] args) {
        ZoneOffset offset1 = ZoneOffset.ofHours(2);
        ZoneOffset offset2 = ZoneOffset.ofHours(2);
        
        boolean isEqual = offset1.equals(offset2);
        System.out.println("Are the offsets equal? " + isEqual);
    }
}
