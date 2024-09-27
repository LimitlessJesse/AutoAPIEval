import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_3 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        FilterReader filterReader = new FilterReader(reader) {
            @Override
            public int read() throws IOException {
                return super.read();
            }
        };

        try {
            filterReader.skip(5); // Skip the first 5 characters
            int data = filterReader.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = filterReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
