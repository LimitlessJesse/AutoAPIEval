import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_11 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        atomicLongArray.lazySet(5, 100);
        System.out.println(atomicLongArray.get(5));
    }
}
