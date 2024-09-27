import java.lang.StringBuffer;

public class StringBuffer_4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before trimToSize(): " + sb.capacity());
        
        sb.trimToSize();
        
        System.out.println("After trimToSize(): " + sb.capacity());
    }
}
