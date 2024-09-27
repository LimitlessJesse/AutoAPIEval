import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_4 {
    public static void main(String[] args) {
        AtomicReferenceArray<String> array = new AtomicReferenceArray<>(3);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "!");

        String element = array.get(1);
        System.out.println(element);  // Output: World
    }
}
