import java.lang.StringBuffer;

public class StringBuffer_3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before ensureCapacity: " + sb.capacity());
        
        sb.ensureCapacity(20);
        System.out.println("After ensureCapacity: " + sb.capacity());
    }
}
