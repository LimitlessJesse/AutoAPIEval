import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;

public class AtomicInteger_14 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        IntBinaryOperator accumulatorFunction = (a, b) -> a + b;
        int previousValue = atomicInteger.getAndAccumulate(3, accumulatorFunction);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
