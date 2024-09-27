import java.util.Optional;

public class Optional_4 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        String value = optional.orElseThrow(() -> new RuntimeException("Value not present"));
        System.out.println(value);
    }
}
