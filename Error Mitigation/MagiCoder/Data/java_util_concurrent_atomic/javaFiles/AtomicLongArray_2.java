import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_2 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        atomicLongArray.set(0, 100);
        long value = atomicLongArray.get(0);
        System.out.println(value);
    }
}
