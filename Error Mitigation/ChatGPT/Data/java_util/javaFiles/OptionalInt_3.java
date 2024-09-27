import java.util.OptionalInt;

public class OptionalInt_3 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(10);
        
        System.out.println("Is value present? " + optionalInt.isPresent());
    }
}
