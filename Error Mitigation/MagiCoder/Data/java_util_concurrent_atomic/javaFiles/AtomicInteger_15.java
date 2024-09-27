import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;

public class AtomicInteger_15 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);

        IntBinaryOperator accumulatorFunction = (currentValue, updateValue) -> currentValue + updateValue;

        int updatedValue = atomicInteger.accumulateAndGet(5, accumulatorFunction);

        System.out.println("Updated value: " + updatedValue);
    }
}
