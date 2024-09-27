import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_10 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int previousValue = atomicInteger.getAndAdd(10);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
