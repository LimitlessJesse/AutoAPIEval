import java.util.OptionalInt;

public class OptionalInt_5 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(5);
        optionalInt.ifPresent(System.out::println);
    }
}
