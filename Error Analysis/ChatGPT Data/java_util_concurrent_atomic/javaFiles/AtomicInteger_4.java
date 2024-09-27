import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_4 {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(10);
        int result = atomicInt.decrementAndGet();
        System.out.println("Result after decrement: " + result);
    }
}
