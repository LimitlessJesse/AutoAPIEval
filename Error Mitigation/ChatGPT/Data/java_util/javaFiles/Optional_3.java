import java.util.Optional;

public class Optional_3 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");
        
        optional.ifPresent(value -> System.out.println("Value is present: " + value));
    }
}
