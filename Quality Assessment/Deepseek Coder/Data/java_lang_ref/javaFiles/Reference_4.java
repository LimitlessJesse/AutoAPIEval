import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class Reference_4 {
    public static void main(String[] args) {
        ReferenceQueue<String> queue = new ReferenceQueue<>();
        String referent = new String("Hello");
        Reference<String,?> reference = new Reference<>(referent, queue);

        System.out.println(reference.isEnqueued()); // Output: false

        referent = null; // Enqueue the reference
        System.gc();

        System.out.println(reference.isEnqueued()); // Output: true
    }
}
