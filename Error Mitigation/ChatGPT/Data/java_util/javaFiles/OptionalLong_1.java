import java.util.OptionalLong;

public class OptionalLong_1 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.empty();
        System.out.println("Is value present? " + optionalLong.isPresent());
    }
}
