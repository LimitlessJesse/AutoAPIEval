import java.util.OptionalDouble;

public class OptionalDouble_5 {
    public static void main(String[] args) {
        OptionalDouble optionalDouble = OptionalDouble.of(10.5);
        double result = optionalDouble.orElse(5.5);
        System.out.println("Value: " + result);
    }
}

