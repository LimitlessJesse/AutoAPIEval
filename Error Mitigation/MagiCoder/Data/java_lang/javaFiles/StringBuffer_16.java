import java.lang.StringBuffer;

public class StringBuffer_16 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println(sb);
    }
}
