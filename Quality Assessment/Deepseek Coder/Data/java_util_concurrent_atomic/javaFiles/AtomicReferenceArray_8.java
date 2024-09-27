import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_8 {
    public static void main(String[] args) {
        AtomicReferenceArray<String> array = new AtomicReferenceArray<>(3);
        array.set(0, "Apple");
        array.set(1, "Banana");
        array.set(2, "Cherry");

        String expectedValue = "Banana";
        String newValue = "Date";
        int index = 1;

        boolean wasModified = array.compareAndSet(index, expectedValue, newValue);

        if (wasModified) {
            System.out.println("Value at index " + index + " was successfully updated from " + expectedValue + " to " + newValue);
        } else {
            System.out.println("Value at index " + index + " was not updated. Expected value was " + expectedValue);
        }

        System.out.println("Array: " + array);
    }
}
