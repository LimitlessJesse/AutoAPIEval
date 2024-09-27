import java.util.OptionalLong;

public class OptionalLong_4 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(123L);
        optionalLong.ifPresent(value -> System.out.println("Value is present: " + value));
    }
}
