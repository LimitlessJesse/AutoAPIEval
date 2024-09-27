import java.util.OptionalInt;

public class OptionalInt_2 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(10);
        if (optionalInt.isPresent()) {
            System.out.println("Value present: " + optionalInt.getAsInt());
        } else {
            System.out.println("No value present");
        }
    }
}
