import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_2 {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(10);
        System.out.println("Initial value: " + atomicInt.get());
        
        atomicInt.set(20);
        System.out.println("New value after set operation: " + atomicInt.get());
    }
}
