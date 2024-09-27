import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_4 {
    public static void main(String[] args) {
        AtomicReference<Integer> atomicReference = new AtomicReference<>(10);
        System.out.println(atomicReference.compareAndSet(10, 20)); // true
        System.out.println(atomicReference.get()); // 20
        System.out.println(atomicReference.compareAndSet(10, 30)); // false
        System.out.println(atomicReference.get()); // 20
    }
}
