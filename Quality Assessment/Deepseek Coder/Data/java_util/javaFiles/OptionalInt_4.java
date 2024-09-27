import java.util.OptionalInt;

public class OptionalInt_4 {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.empty();
        if(optionalInt.isPresent()) {
            int value = optionalInt.getAsInt();
            System.out.println(value);
        } else {
            System.out.println("No value present");
        }
    }
}
