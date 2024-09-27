import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_3 {
    public static void main(String[] args) {
        AtomicReferenceArray<Integer> array = new AtomicReferenceArray<>(5);
        array.set(0, 10);
        
        // Get value at index 0
        Integer value = array.get(0);
        System.out.println("Value at index 0: " + value);
    }
}
