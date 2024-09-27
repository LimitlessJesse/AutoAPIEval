import java.lang.ref.PhantomReference;

public class PhantomReference_1 {
    public static void main(String[] args) {
        Object obj = new Object();
        PhantomReference<Object> phantomRef = new PhantomReference<>(obj, null);
        
        System.out.println(phantomRef.get());
    }
}
