import java.util.OptionalDouble;
import java.util.NoSuchElementException;

public class OptionalDouble_4 {
    public static void main(String[] args) {
        OptionalDouble optionalDouble = OptionalDouble.of(10.5);
        
        try {
            double value = optionalDouble.getAsDouble();
            System.out.println("Value: " + value);
        } catch (NoSuchElementException e) {
            System.out.println("No value present");
        }
    }
}
