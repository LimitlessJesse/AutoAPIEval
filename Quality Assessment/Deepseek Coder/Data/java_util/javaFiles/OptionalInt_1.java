import java.util.OptionalInt;

public class OptionalInt_1 {
    public static void main(String[] args) {
        OptionalInt optional = OptionalInt.of(5);
        if (optional.isPresent()) {
            System.out.println(optional.getAsInt());  // prints: 5
        } else {
            System.out.println("No value present");
        }
    }
}
