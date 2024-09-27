import java.util.OptionalDouble;

public class OptionalDouble_3 {
    public static void main(String[] args) {
        OptionalDouble optionalDouble = OptionalDouble.of(10.5);
        System.out.println("Is a value present? " + optionalDouble.isPresent());
    }
}
