import java.io.StringBufferInputStream;

public class StringBufferInputStream_5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello, World!");
        StringBufferInputStream sbis = new StringBufferInputStream(sb);
        try {
            int available = sbis.available();
            System.out.println("Number of bytes available: " + available);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
