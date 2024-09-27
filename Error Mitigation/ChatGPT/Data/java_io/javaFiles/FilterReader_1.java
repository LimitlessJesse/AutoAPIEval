import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_1 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        FilterReader filterReader = new FilterReader(reader) {
            @Override
            public int read() throws IOException {
                return super.read();
            }
        };

        try {
            int charRead = filterReader.read();
            System.out.println((char) charRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
