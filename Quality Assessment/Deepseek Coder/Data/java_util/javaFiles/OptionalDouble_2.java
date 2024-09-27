import java.util.OptionalDouble;

public class OptionalDouble_2 {
    public static void main(String[] args) {
        OptionalDouble optional = OptionalDouble.of(55.5);
        System.out.println(optional.isPresent()); // prints: true

        OptionalDouble emptyOptional = OptionalDouble.empty();
        System.out.println(emptyOptional.isPresent()); // prints: false
    }
}
