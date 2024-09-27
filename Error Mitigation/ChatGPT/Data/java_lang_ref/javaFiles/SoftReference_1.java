import java.lang.ref.SoftReference;

public class SoftReference_1 {
    public static void main(String[] args) {
        String str = "Hello";
        SoftReference<String> softRef = new SoftReference<>(str);
        
        System.out.println("Soft reference before garbage collection: " + softRef.get());
        
        str = null; // Clearing the strong reference
        
        System.gc(); // Requesting garbage collection
        
        System.out.println("Soft reference after garbage collection: " + softRef.get());
    }
}
