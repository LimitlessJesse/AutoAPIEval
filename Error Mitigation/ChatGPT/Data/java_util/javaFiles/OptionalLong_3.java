import java.util.OptionalLong;

public class OptionalLong_3 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(10);
        
        System.out.println("Is value present? " + optionalLong.isPresent());
    }
}
