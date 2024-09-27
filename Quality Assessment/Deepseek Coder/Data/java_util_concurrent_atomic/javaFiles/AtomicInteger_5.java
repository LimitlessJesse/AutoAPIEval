import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_5 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int newValue = atomicInteger.decrementAndGet();
        System.out.println(newValue);
    }
}
