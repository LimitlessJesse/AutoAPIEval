import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;

public class FilterWriter_3 {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        FilterWriter filterWriter = new FilterWriter(stringWriter) {
            @Override
            public void write(String str, int off, int len) throws IOException {
                super.write(str, off, len);
            }
        };

        try {
            filterWriter.write("Example String", 0, 7);
            System.out.println(stringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
