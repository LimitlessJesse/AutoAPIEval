import java.io.FilterWriter;
import java.io.StringWriter;
import java.io.IOException;

public class FilterWriter_5 {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        FilterWriter filterWriter = new FilterWriter(stringWriter) {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                super.write(cbuf, off, len);
            }
        };

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        try {
            filterWriter.write(chars, 0, 5);
            System.out.println(stringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
