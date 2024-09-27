import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_5 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(5);
        atomicLongArray.set(0, 10);
        atomicLongArray.set(1, 20);
        atomicLongArray.set(2, 30);
        atomicLongArray.set(3, 40);
        atomicLongArray.set(4, 50);

        long newValue = 100;
        int index = 2;

        long oldValue = atomicLongArray.getAndSet(index, newValue);

        System.out.println("Old value at index " + index + ": " + oldValue);
        System.out.println("New value at index " + index + ": " + atomicLongArray.get(index));
    }
}
