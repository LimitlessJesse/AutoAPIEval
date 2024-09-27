import java.time.temporal.ValueRange;

public class ValueRange_4 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(1, 12);
        System.out.println("Is int value: " + range.isIntValue()); // Output: true
        
        ValueRange range2 = ValueRange.of(1, 86400000000000L);
        System.out.println("Is int value: " + range2.isIntValue()); // Output: false
    }
}
