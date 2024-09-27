import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_4 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        FilterReader filterReader = new FilterReader(reader) {
            @Override
            public void mark(int readAheadLimit) throws IOException {
                super.mark(readAheadLimit);
            }
        };

        try {
            filterReader.mark(5);
            int data = filterReader.read();
            System.out.println((char) data); // Output: H
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
