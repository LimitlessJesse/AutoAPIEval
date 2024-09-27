import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_4 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");

        String expectedReference = "Initial Value";
        String newReference = "New Value";

        boolean result = atomicReference.weakCompareAndSet(expectedReference, newReference);

        System.out.println("Expected reference: " + expectedReference);
        System.out.println("New reference: " + newReference);
        System.out.println("Result: " + result);
        System.out.println("Atomic reference after weakCompareAndSet: " + atomicReference.get());
    }
}
