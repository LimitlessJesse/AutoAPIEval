import java.lang.StringBuffer;

public class StringBuffer_5 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Before: " + buffer);
        buffer.setLength(5);
        System.out.println("After: " + buffer);
    }
}
