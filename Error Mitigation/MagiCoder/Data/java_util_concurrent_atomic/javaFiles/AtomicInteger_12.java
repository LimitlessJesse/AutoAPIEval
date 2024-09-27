import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

public class AtomicInteger_12 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        IntUnaryOperator updateFunction = (int i) -> i * 2;
        int previousValue = atomicInteger.getAndUpdate(updateFunction);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
