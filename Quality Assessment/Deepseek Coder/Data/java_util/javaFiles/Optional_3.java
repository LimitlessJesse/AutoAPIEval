import java.util.Optional;

public class Optional_3 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        boolean isPresent = optional.isPresent();
        System.out.println(isPresent);  // Output: true
    }
}
