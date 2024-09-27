import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_3 {
    public static void main(String[] args) {
        AtomicReference<Integer> atomicInt = new AtomicReference<>(10);
        
        System.out.println("Current value: " + atomicInt.get());
        
        boolean success = atomicInt.compareAndSet(10, 20);
        
        System.out.println("Updated value: " + atomicInt.get());
        System.out.println("Operation successful: " + success);
    }
}
