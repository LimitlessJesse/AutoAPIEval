import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        int currentValue = atomicInteger.get();
        System.out.println("Current value: " + currentValue);
    }
}
