import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_3 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(5);
        atomicLongArray.set(0, 100);
        atomicLongArray.set(1, 200);
        atomicLongArray.set(2, 300);
        atomicLongArray.set(3, 400);
        atomicLongArray.set(4, 500);

        long value = atomicLongArray.get(2);
        System.out.println("Value at index 2: " + value);
    }
}
