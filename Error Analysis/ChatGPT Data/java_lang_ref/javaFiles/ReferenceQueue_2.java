import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class ReferenceQueue_2 {
    public static void main(String[] args) {
        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        String str = new String("Hello");
        Reference<String> reference = new java.lang.ref.WeakReference<>(str, referenceQueue);

        // Enqueuing the reference
        System.out.println("Enqueuing the reference...");
        str = null;
        System.gc();

        try {
            // Removing the reference when it gets enqueued
            System.out.println("Trying to remove the reference...");
            Reference<? extends String> removedReference = referenceQueue.remove();

            if (removedReference != null) {
                System.out.println("Reference removed: " + removedReference.get());
            } else {
                System.out.println("No reference available to remove.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

