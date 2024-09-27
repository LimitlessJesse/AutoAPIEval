import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_3 {
    public static void main(String[] args) {
        AtomicReference<Integer> atomicRef = new AtomicReference<>(10);
        
        // Initial value
        System.out.println("Initial Value: " + atomicRef.get());
        
        // Compare and set operation
        boolean result = atomicRef.compareAndSet(10, 20);
        System.out.println("Set successful: " + result);
        System.out.println("Updated Value: " + atomicRef.get());
    }
}
