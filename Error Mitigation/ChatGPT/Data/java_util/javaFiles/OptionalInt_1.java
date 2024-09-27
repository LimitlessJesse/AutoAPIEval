import java.util.OptionalInt;

public class OptionalInt_1 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.empty();
        System.out.println("Is value present: " + optionalInt.isPresent());
    }
}
