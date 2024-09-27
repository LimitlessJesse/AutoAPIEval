import java.util.Optional;
import java.util.function.Predicate;

public class Optional_5 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        
        Optional<String> result = optional.filter(s -> s.startsWith("H"));
        
        if(result.isPresent()) {
            System.out.println("Value starts with 'H': " + result.get());
        } else {
            System.out.println("Value does not start with 'H'");
        }
    }
}
