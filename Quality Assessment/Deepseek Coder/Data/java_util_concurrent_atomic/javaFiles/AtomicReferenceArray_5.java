import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_5 {
    public static void main(String[] args) {
        AtomicReferenceArray<String> array = new AtomicReferenceArray<>(3);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "!");

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
    }
}
