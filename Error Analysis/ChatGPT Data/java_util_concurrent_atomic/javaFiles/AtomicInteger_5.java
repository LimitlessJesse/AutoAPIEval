import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_5 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println("Before getAndIncrement(): " + atomicInteger.get());
        System.out.println("getAndIncrement() Result: " + atomicInteger.getAndIncrement());
        System.out.println("After getAndIncrement(): " + atomicInteger.get());
    }
}
