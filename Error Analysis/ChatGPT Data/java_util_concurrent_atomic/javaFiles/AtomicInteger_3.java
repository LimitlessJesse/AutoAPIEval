import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_3 {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(10);
        int incrementedValue = atomicInt.incrementAndGet();
        System.out.println("Incremented value: " + incrementedValue);
    }
}
