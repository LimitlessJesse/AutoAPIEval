import java.util.OptionalDouble;

public class OptionalDouble_1 {
    public static void main(String[] args) {
        OptionalDouble optional = OptionalDouble.of(55.5);
        if(optional.isPresent()) {
            System.out.println("Value is: " + optional.getAsDouble());
        } else {
            System.out.println("Value is not present");
        }
    }
}
