import java.util.OptionalDouble;

public class OptionalDouble_2 {
    public static void main(String[] args) {
        OptionalDouble optionalDouble = OptionalDouble.of(10.5);
        if (optionalDouble.isPresent()) {
            System.out.println("Value present: " + optionalDouble.getAsDouble());
        } else {
            System.out.println("No value present");
        }
    }
}
