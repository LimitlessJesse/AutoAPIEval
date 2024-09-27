import java.util.Optional;

public class Optional_5 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        optional.ifPresent(str -> System.out.println("Value: " + str));
    }
}
