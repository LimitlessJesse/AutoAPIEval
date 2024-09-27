import java.io.IOException;
import java.io.StringWriter;

public class Writer_3 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        String str = "Hello World";
        int off = 6;
        int len = 5;
        
        try {
            writer.write(str, off, len);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
