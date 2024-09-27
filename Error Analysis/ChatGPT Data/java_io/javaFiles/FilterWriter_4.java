import java.io.FilterWriter;
import java.io.StringWriter;
import java.io.IOException;

public class FilterWriter_4 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        
        try {
            FilterWriter filterWriter = new FilterWriter(writer) {
                @Override
                public void write(String str, int off, int len) throws IOException {
                    super.write(str, off, len);
                }
            };
            
            String text = "Hello World";
            filterWriter.write(text, 6, 5); // Writes "World" starting from index 6
            
            System.out.println(writer.toString()); // Output: World
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
