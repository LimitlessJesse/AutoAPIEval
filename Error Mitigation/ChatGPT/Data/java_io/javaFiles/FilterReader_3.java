import java.io.FilterReader;
import java.io.IOException;
import java.io.StringReader;

public class FilterReader_3 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello World");
        FilterReader filterReader = new FilterReader(stringReader) {
            @Override
            public boolean ready() throws IOException {
                return super.ready();
            }
        };

        try {
            System.out.println("Is the stream ready to be read? " + filterReader.ready());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
