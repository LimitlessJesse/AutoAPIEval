import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_5 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        FilterReader filterReader = new FilterReader(reader) {
            @Override
            public void reset() throws IOException {
                super.reset();
            }
        };

        try {
            filterReader.reset();
            int data = filterReader.read();
            System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
