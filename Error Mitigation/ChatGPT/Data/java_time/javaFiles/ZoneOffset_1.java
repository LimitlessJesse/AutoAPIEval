import java.time.ZoneOffset;

public class ZoneOffset_1 {
    public static void main(String[] args) {
        ZoneOffset offset1 = ZoneOffset.ofHours(2);
        ZoneOffset offset2 = ZoneOffset.ofHours(1);
        
        int comparison = offset1.compareTo(offset2);
        
        if(comparison < 0) {
            System.out.println(offset1 + " is less than " + offset2);
        } else if(comparison > 0) {
            System.out.println(offset1 + " is greater than " + offset2);
        } else {
            System.out.println(offset1 + " is equal to " + offset2);
        }
    }
}
