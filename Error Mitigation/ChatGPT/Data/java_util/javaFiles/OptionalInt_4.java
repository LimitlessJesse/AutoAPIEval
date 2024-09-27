import java.util.OptionalInt;

public class OptionalInt_4 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(5);
        
        int result = optionalInt.orElse(10);
        System.out.println("Result: " + result);
        
        OptionalInt emptyOptionalInt = OptionalInt.empty();
        int result2 = emptyOptionalInt.orElse(10);
        System.out.println("Result2: " + result2);
    }
}
