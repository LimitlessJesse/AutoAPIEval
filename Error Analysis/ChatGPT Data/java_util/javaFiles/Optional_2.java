import java.util.Optional;

public class Optional_2 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");
        
        String value = optional.get();
        System.out.println("Value: " + value);
    }
}
