import java.util.OptionalLong;

public class OptionalLong_1 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(1234567890L);
        System.out.println(optionalLong.isPresent()); // prints: true
        System.out.println(optionalLong.getAsLong()); // prints: 1234567890
    }
}
