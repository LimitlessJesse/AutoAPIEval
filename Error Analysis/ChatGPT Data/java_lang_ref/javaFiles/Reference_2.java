import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Reference_2 {
    public static void main(String[] args) {
        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        WeakReference<String> weakReference = new WeakReference<>("Hello", referenceQueue);
        
        System.out.println("Before clearing: " + weakReference.get());
        
        weakReference.clear();
        
        System.out.println("After clearing: " + weakReference.get());
    }
}
