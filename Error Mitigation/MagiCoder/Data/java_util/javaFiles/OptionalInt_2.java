import java.util.OptionalInt;

public class OptionalInt_2 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(10);
        System.out.println(optionalInt.getAsInt());
    }
}
