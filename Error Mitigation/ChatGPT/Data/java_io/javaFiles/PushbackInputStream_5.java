import java.io.PushbackInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public class PushbackInputStream_5 {
    public static void main(String[] args) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(new FilterInputStream(new InputStream() {
            @Override
            public int read() {
                return 0;
            }
        }));
        
        boolean isMarkSupported = pushbackInputStream.markSupported();
        System.out.println("Mark Supported: " + isMarkSupported);
    }
}
