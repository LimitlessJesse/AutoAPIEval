import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;

public class FilterWriter_5 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        FilterWriter filterWriter = new FilterWriter(writer) {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                super.out.write(cbuf, off, len);
            }
        };

        try {
            filterWriter.write("Hello, World!!", 0, 13);
            filterWriter.flush();
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
