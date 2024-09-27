import java.util.OptionalDouble;

public class OptionalDouble_2 {
    public static void main(String[] args) {
        OptionalDouble optionalDouble = OptionalDouble.of(3.14);
        if (optionalDouble.isPresent()) {
            System.out.println("Value is present: " + optionalDouble.getAsDouble());
        } else {
            System.out.println("Value is not present");
        }
    }
}
