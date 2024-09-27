import java.util.OptionalInt;
import java.util.function.IntSupplier;

public class OptionalInt_5 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.empty();
        
        // Using orElseGet method
        int result = optionalInt.orElseGet(() -> 10);
        System.out.println("Result: " + result);
    }
}
