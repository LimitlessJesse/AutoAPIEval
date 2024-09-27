import java.util.Optional;

public class Optional_4 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");
        
        String result = optional.orElse("Default");
        System.out.println(result); // Output: Value
        
        Optional<String> emptyOptional = Optional.empty();
        
        String result2 = emptyOptional.orElse("Default");
        System.out.println(result2); // Output: Default
    }
}
