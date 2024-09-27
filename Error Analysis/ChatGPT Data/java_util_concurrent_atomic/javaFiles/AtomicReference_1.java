import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_1 {
    public static void main(String[] args) {
        AtomicReference<Integer> atomicInt = new AtomicReference<>(10);
        
        atomicInt.set(20);
        
        System.out.println("New value: " + atomicInt.get());
    }
}
