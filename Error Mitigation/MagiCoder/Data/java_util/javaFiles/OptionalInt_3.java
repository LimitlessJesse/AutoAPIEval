import java.util.OptionalInt;

public class OptionalInt_3 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(10);
        int result = optionalInt.orElse(20);
        System.out.println(result); // Output: 10

        OptionalInt emptyOptionalInt = OptionalInt.empty();
        int result2 = emptyOptionalInt.orElse(20);
        System.out.println(result2); // Output: 20
    }
}
