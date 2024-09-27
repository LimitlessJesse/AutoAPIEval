import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println("Value before get(): " + atomicInteger.get());
    }
}
