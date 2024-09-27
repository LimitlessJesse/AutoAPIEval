import java.util.OptionalDouble;

public class OptionalDouble_5 {
    public static void main(String[] args) {
        OptionalDouble optionalDouble = OptionalDouble.of(10.5);
        
        double result = optionalDouble.orElse(0.0);
        System.out.println("Value present: " + result);
        
        OptionalDouble emptyOptional = OptionalDouble.empty();
        double result2 = emptyOptional.orElse(5.0);
        System.out.println("No value present, returned other value: " + result2);
    }
}
