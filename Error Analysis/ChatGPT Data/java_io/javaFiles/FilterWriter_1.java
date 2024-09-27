import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class FilterWriter_1 {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        CustomFilterWriter customFilterWriter = new CustomFilterWriter(stringWriter);
        
        try {
            customFilterWriter.write('a');
            System.out.println(stringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class CustomFilterWriter extends FilterWriter {
    protected CustomFilterWriter(Writer out) {
        super(out);
    }

    @Override
    public void write(int c) throws IOException {
        // Custom logic before writing
        super.write(c); // actual writing
    }
}
