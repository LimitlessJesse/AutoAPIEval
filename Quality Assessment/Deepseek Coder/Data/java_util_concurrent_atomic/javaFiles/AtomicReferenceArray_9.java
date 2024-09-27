import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_9 {
    public static void main(String[] args) {
        AtomicReferenceArray<String> array = new AtomicReferenceArray<>(3);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "!");

        boolean result = array.weakCompareAndSet(0, "Hello", "Hi");
        System.out.println("Result: " + result);
        System.out.println("Array: " + array.get(0));
    }
}
