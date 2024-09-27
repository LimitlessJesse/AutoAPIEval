import java.util.OptionalLong;

public class OptionalLong_5 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(10);
        
        long result = optionalLong.orElse(5);
        System.out.println("Result: " + result);
        
        OptionalLong emptyOptionalLong = OptionalLong.empty();
        long result2 = emptyOptionalLong.orElse(5);
        System.out.println("Result2: " + result2);
    }
}
