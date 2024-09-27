import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

public class AtomicLong_20 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        LongUnaryOperator updateFunction = value -> value * 2;

        long previousValue = atomicLong.getAndUpdate(updateFunction);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicLong.get());
    }
}
