import java.lang.StringBuffer;

public class StringBuffer_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before setLength: " + sb.toString());
        
        sb.setLength(8);
        System.out.println("After setLength: " + sb.toString());
    }
}
