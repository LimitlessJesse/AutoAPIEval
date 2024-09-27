import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_12 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        atomicLongArray.set(0, 10);
        boolean result = atomicLongArray.compareAndSet(0, 10, 20);
        System.out.println(result); // prints: true
        System.out.println(atomicLongArray.get(0)); // prints: 20

        result = atomicLongArray.compareAndSet(0, 10, 30);
        System.out.println(result); // prints: false
        System.out.println(atomicLongArray.get(0)); // prints: 20
    }
}
