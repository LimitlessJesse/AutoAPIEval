import java.util.OptionalInt;

public class OptionalInt_3 {
    public static void main(String[] args) {
        OptionalInt optional = OptionalInt.of(5);
        System.out.println(optional.isPresent()); // prints: true

        OptionalInt emptyOptional = OptionalInt.empty();
        System.out.println(emptyOptional.isPresent()); // prints: false
    }
}
