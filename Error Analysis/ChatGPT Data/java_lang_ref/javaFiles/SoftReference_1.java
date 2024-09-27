import java.lang.ref.SoftReference;

public class SoftReference_1 {
    public static void main(String[] args) {
        String str = new String("Hello");
        SoftReference<String> softRef = new SoftReference<>(str);
        
        // Get the value from SoftReference
        String value = softRef.get();
        
        System.out.println(value);
    }
}
