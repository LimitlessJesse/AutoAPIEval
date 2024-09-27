import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_20 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        int previousValue = atomicInteger.getAndSet(20);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
