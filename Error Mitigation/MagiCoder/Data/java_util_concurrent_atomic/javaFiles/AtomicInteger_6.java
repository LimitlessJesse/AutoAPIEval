import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_6 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        int updatedValue = atomicInteger.decrementAndGet();
        System.out.println("Updated value: " + updatedValue);
    }
}
