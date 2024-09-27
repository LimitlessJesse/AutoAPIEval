import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_5 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.lazySet(0, 10);
        System.out.println(array.get(0)); // Output: 10
    }
}
