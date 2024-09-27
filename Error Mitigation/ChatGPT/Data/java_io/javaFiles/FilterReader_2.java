import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_2 {
    public static void main(String[] args) {
        char[] cbuf = new char[5];
        int off = 0;
        int len = 5;
        
        StringReader stringReader = new StringReader("Hello World");
        FilterReader filterReader = new FilterReader(stringReader) {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return super.read(cbuf, off, len);
            }
        };
        
        try {
            int numCharsRead = filterReader.read(cbuf, off, len);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Characters read: ");
            for (int i = 0; i < numCharsRead; i++) {
                System.out.print(cbuf[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
