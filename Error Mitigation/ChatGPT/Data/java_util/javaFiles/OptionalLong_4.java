import java.util.OptionalLong;
import java.util.NoSuchElementException;

public class OptionalLong_4 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(10);
        
        try {
            long value = optionalLong.getAsLong();
            System.out.println("Value: " + value);
        } catch (NoSuchElementException e) {
            System.out.println("No value present");
        }
    }
}
