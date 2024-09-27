import java.util.OptionalLong;
import java.util.function.LongConsumer;

public class OptionalLong_5 {
    public static void main(String[] args) {
        OptionalLong optionalLong = OptionalLong.of(10);
        
        optionalLong.ifPresent(new LongConsumer() {
            @Override
            public void accept(long value) {
                System.out.println("Value present: " + value);
            }
        });
    }
}
