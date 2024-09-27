import java.io.LineNumberInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class LineNumberInputStream_5 {
    public static void main(String[] args) {
        LineNumberInputStream inputStream = new LineNumberInputStream(new FilterInputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });
        
        inputStream.mark(10);
    }
}
