import java.util.Optional;

public class Optional_1 {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Value");
        System.out.println("Is value present? " + optionalValue.isPresent()); // Output: true
        
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Is empty optional present? " + emptyOptional.isPresent()); // Output: false
    }
}
