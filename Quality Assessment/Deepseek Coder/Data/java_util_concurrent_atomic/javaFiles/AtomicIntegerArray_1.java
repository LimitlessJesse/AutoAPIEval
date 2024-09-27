import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_1 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);

        int value = array.get(2);
        System.out.println(value);  // Output: 3
    }
}
