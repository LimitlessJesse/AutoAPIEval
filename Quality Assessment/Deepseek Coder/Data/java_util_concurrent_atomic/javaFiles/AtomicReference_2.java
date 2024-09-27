import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_2 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");

        String expectedReference = "Initial Value";
        String newReference = "New Value";

        boolean isUpdated = atomicReference.compareAndSet(expectedReference, newReference);

        if (isUpdated) {
            System.out.println("Update successful. New value: " + atomicReference.get());
        } else {
            System.out.println("Update failed. Expected value: " + expectedReference + ", Actual value: " + atomicReference.get());
        }
    }
}
