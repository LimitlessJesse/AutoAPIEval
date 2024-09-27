import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;

public class FilterWriter_4 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        FilterWriter filterWriter = new FilterWriter(writer) {
            @Override
            public void write(String str, int off, int len) throws IOException {
                super.out.write(str.toCharArray(), off, len);
            }
        };

        try {
            filterWriter.write("Hello, World!!!", 0, 5);
            filterWriter.flush();
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
