import java.util.OptionalDouble;

public class OptionalDouble_1 {
    public static void main(String[] args) {
        OptionalDouble optionalDouble = OptionalDouble.empty();
        System.out.println("Is value present: " + optionalDouble.isPresent());
    }
}
