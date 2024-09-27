import java.lang.StringBuffer;

public class StringBuffer_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.ensureCapacity(10);
        System.out.println("Initial Capacity: " + sb.capacity());
        sb.append("Hello, World!");
        System.out.println("Final Capacity: " + sb.capacity());
    }
}
