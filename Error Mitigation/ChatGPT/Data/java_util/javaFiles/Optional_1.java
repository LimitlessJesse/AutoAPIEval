import java.util.Optional;

public class Optional_1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");
        
        System.out.println("Is value present? " + optional.isPresent());
    }
}
