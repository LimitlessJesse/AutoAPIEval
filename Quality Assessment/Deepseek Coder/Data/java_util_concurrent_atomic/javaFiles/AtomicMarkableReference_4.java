import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_4 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> reference = new AtomicMarkableReference<>("Initial Value", false);

        boolean result = reference.compareAndSet("Initial Value", "New Value", false, true);

        if (result) {
            System.out.println("Value was updated: " + reference.getReference());
            System.out.println("Mark was updated: " + reference.isMarked());
        } else {
            System.out.println("Value was not updated");
        }
    }
}
