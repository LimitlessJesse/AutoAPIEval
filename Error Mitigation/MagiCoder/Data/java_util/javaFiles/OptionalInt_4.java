import java.util.OptionalInt;

public class OptionalInt_4 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(10);
        int result = optionalInt.orElseGet(() -> {
            System.out.println("Value is not present, so generating a new one...");
            return 20;
        });
        System.out.println("Result: " + result);
    }
}
