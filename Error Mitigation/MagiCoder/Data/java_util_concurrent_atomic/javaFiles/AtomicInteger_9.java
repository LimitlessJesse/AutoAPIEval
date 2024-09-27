import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_9 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int newValue = atomicInteger.addAndGet(10);
        System.out.println("New value: " + newValue);
    }
}
