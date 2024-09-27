import java.util.OptionalInt;

public class OptionalInt_13 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(10);
        int hashCode = optionalInt.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
