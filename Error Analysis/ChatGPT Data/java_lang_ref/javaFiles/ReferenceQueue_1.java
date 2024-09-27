import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class ReferenceQueue_1 {
    public static void main(String[] args) {
        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        String str = new String("Hello");
        Reference<String> reference = new java.lang.ref.WeakReference<>(str, referenceQueue);
        
        System.out.println("Reference before polling: " + reference.get());
        Reference<? extends String> polledRef = referenceQueue.poll();
        System.out.println("Polled reference: " + polledRef.get());
    }
}
