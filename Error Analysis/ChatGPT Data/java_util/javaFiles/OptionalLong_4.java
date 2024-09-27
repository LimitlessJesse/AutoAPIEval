import java.util.OptionalLong;
import java.util.function.LongSupplier;

public class OptionalLong_4 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.empty();
        
        // Using orElseGet(LongSupplier other) method
        long result = optionalLong.orElseGet(() -> 10L);
        
        System.out.println("Result: " + result);
    }
}
