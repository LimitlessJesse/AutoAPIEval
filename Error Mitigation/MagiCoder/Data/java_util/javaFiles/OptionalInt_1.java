import java.util.OptionalInt;

public class OptionalInt_1 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(5);
        System.out.println(optionalInt.isPresent()); // Output: true

        OptionalInt emptyOptionalInt = OptionalInt.empty();
        System.out.println(emptyOptionalInt.isPresent()); // Output: false
    }
}
