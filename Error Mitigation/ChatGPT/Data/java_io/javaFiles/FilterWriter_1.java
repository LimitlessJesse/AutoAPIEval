import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;

public class FilterWriter_1 {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        FilterWriter filterWriter = new FilterWriter(stringWriter) {
            @Override
            public void write(int c) throws IOException {
                super.write(c);
            }
        };

        try {
            filterWriter.write('A');
            System.out.println(stringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
