import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

public class AtomicInteger_13 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);

        IntUnaryOperator updateFunction = (int i) -> i * 2;

        int updatedValue = atomicInteger.updateAndGet(updateFunction);

        System.out.println("Updated value: " + updatedValue);
    }
}
