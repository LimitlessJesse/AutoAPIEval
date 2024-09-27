import java.util.OptionalDouble;

public class OptionalDouble_3 {
    public static void main(String[] args) {
        OptionalDouble optional = OptionalDouble.of(55.5);
        if(optional.isPresent()) {
            double value = optional.getAsDouble();
            System.out.println("Value: " + value);
        } else {
            System.out.println("Value is not present");
        }
    }
}
