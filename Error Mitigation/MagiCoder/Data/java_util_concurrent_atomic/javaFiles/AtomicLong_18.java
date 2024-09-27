import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongBinaryOperator;

public class AtomicLong_18 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        LongBinaryOperator accumulatorFunction = (current, update) -> current + update;
        long previousValue = atomicLong.getAndAccumulate(5, accumulatorFunction);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicLong.get());
    }
}
