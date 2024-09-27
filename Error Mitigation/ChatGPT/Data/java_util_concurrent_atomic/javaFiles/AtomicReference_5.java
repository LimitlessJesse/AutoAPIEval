import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_5 {
    public static void main(String[] args) {
        AtomicReference<Integer> atomicInt = new AtomicReference<>(10);
        
        boolean result = atomicInt.weakCompareAndSet(10, 20);
        System.out.println("Update successful: " + result);
        System.out.println("Current value: " + atomicInt.get());
    }
}
