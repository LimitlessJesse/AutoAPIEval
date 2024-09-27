import java.util.Optional;

public class Optional_4 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        System.out.println(optional.get());
    }
}
