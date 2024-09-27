import java.util.OptionalLong;

public class OptionalLong_2 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(10);
        if (optionalLong.isPresent()) {
            System.out.println("Value present: " + optionalLong.getAsLong());
        } else {
            System.out.println("No value present");
        }
    }
}
