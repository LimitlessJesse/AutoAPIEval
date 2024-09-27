import java.io.StringBufferInputStream;

public class StringBufferInputStream_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");
        StringBufferInputStream sbis = new StringBufferInputStream(sb);

        int i;
        while ((i = sbis.read())!= -1) {
            System.out.print((char) i);
        }
    }
}
