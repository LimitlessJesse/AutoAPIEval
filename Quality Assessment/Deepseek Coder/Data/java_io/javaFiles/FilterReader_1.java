import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_1 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello, World!");
        FilterReader filterReader = new FilterReader(stringReader) {
            @Override
            public int read() throws IOException {
                return super.read();
            }
        };

        try {
            int data;
            while ((data = filterReader.read())!= -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
