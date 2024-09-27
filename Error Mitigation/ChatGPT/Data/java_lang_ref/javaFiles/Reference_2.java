import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class Reference_2 {
    public static void main(String[] args) {
        Object obj = new Object();
        Reference<Object> ref = new WeakReference<>(obj);
        
        System.out.println("Is enqueued: " + ref.isEnqueued());
    }
}
