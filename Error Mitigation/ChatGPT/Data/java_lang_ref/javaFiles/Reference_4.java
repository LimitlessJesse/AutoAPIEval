import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Reference_4 {
    public static void main(String[] args) {
        Object obj = new Object();
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        Reference<Object> ref = new WeakReference<>(obj, queue);
        
        boolean enqueued = ref.enqueue();
        System.out.println("Is enqueued: " + enqueued);
    }
}
