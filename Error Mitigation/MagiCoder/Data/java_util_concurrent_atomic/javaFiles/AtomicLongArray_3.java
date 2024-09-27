import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_3 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        atomicLongArray.set(5, 100L);
        System.out.println(atomicLongArray.get(5));
    }
}
