import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

public class AtomicLong_19 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);

        LongUnaryOperator updateFunction = (long currentValue) -> {
            return currentValue + 1;
        };

        long updatedValue = atomicLong.updateAndGet(updateFunction);

        System.out.println("Updated value: " + updatedValue);
    }
}
