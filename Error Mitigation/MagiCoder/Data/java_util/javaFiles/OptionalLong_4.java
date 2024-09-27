import java.util.OptionalLong;

public class OptionalLong_4 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(100L);
        if (optionalLong.isPresent()) {
            long value = optionalLong.getAsLong();
            System.out.println("Value: " + value);
        } else {
            System.out.println("No value present");
        }
    }
}
