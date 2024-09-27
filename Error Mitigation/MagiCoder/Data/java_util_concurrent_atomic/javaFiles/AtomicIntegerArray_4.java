import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_4 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(10);
        array.set(0, 10);
        boolean result = array.compareAndSet(0, 10, 20);
        System.out.println(result); // prints: true
        System.out.println(array.get(0)); // prints: 20
        result = array.compareAndSet(0, 10, 30);
        System.out.println(result); // prints: false
        System.out.println(array.get(0)); // prints: 20
    }
}
