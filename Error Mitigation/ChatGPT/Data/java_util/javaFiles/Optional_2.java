import java.util.Optional;
import java.util.NoSuchElementException;

public class Optional_2 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");
        
        try {
            String value = optional.get();
            System.out.println("Value: " + value);
        } catch (NoSuchElementException e) {
            System.out.println("No value present");
        }
    }
}
