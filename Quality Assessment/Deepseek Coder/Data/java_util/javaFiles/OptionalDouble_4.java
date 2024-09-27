import java.util.OptionalDouble;

public class OptionalDouble_4 {
    public static void main(String[] args) {
        OptionalDouble optional = OptionalDouble.of(5.5);
        double value = optional.orElse(3.3);
        System.out.println(value);  // Output: 5.5
    }
}
