import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_1 {
    public static void main(String[] args) {
        AtomicReferenceArray<Integer> array = new AtomicReferenceArray<>(5);
        array.set(2, 10);
        System.out.println(array.get(2)); // Output: 10
    }
}
