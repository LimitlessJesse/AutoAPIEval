import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_3 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int result = atomicInteger.getAndDecrement();
        System.out.println("Initial value: " + result);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
