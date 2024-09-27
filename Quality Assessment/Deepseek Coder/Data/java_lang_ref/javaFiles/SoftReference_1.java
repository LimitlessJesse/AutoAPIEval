import java.lang.ref.SoftReference;

public class SoftReference_1 {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        SoftReference<String> softRef = new SoftReference<>(str);

        // Get the object
        String referent = softRef.get();
        if (referent!= null) {
            System.out.println("The referenced object: " + referent);
        } else {
            System.out.println("The object has been garbage collected.");
        }

        // Garbage collect the object
        System.gc();

        // Try to get the object again
        referent = softRef.get();
        if (referent!= null) {
            System.out.println("The referenced object: " + referent);
        } else {
            System.out.println("The object has been garbage collected.");
        }
    }
}
