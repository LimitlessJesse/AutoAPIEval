import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int result = atomicInteger.getAndIncrement();
        System.out.println("Result: " + result);
        System.out.println("AtomicInteger: " + atomicInteger.get());
    }
}
