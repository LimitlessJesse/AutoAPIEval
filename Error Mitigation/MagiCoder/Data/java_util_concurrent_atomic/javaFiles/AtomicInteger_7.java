import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_7 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        int expect = 10;
        int update = 20;
        boolean result = atomicInteger.compareAndSet(expect, update);
        System.out.println("Result: " + result);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
