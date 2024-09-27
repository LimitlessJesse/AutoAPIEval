import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_4 {
    public static void main(String[] args) {
        AtomicReferenceArray<Integer> array = new AtomicReferenceArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);

        System.out.println("Length of array: " + array.length());
    }
}
