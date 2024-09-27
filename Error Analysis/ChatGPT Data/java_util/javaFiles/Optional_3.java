import java.util.Optional;

public class Optional_3 {
    public static void main(String[] args) {
        Optional<String> value = Optional.of("Hello");
        Optional<String> otherValue = Optional.of("World");
        
        System.out.println(value.orElse(otherValue.get()));
    }
}
