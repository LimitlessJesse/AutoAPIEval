import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_5 {
    public static void main(String[] args) {
        AtomicReference<Integer> atomicInt = new AtomicReference<>(0);
        
        boolean result = atomicInt.weakCompareAndSet(0, 1);
        System.out.println("If update was successful: " + result);
        System.out.println("Current value: " + atomicInt.get());
    }
}
