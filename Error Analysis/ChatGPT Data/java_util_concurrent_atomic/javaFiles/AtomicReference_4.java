import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_4 {
    public static void main(String[] args) {
        AtomicReference<Integer> atomicInt = new AtomicReference<>(10);
        System.out.println("Old value: " + atomicInt.getAndSet(20));
        System.out.println("New value: " + atomicInt.get());
    }
}
