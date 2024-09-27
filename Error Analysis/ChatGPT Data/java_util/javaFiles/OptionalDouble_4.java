import java.util.OptionalDouble;

public class OptionalDouble_4 {
    public static void main(String[] args) {
        // Example using OptionalDouble
        OptionalDouble optionalDouble = OptionalDouble.of(5.6);
        
        // Use getAsDouble() to retrieve the double value
        if (optionalDouble.isPresent()) {
            double value = optionalDouble.getAsDouble();
            System.out.println("Value: " + value);
        } else {
            System.out.println("No value present");
        }
    }
}
