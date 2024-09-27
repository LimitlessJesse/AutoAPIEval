import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_2 {
    public static void main(String[] args) {
        AtomicReferenceArray<String> array = new AtomicReferenceArray<>(3);
        array.set(0, "Hello");
        System.out.println("Current value at index 0: " + array.get(0));

        boolean updated = array.compareAndSet(0, "Hello", "World");

        if(updated) {
            System.out.println("Value at index 0 updated to: " + array.get(0));
        } else {
            System.out.println("Value at index 0 was not updated as expected value was different.");
        }
    }
}
