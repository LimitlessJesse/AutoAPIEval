import java.util.Optional;

public class Optional_4 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        
        Optional<String> mappedOptional = optional.map(s -> s.toUpperCase());
        
        mappedOptional.ifPresent(System.out::println);
    }
}
