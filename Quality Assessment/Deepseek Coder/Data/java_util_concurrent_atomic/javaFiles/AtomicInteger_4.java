import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_4 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int newValue = atomicInteger.incrementAndGet();
        System.out.println(newValue);
    }
}
