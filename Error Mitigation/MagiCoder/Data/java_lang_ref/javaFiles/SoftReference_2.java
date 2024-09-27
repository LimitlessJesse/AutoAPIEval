import java.lang.ref.SoftReference;

public class SoftReference_2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        SoftReference<String> softRef = new SoftReference<>(str);

        // Get the object
        String obj = softRef.get();
        if (obj!= null) {
            System.out.println(obj);
        } else {
            System.out.println("The object has been garbage collected.");
        }
    }
}
