import java.io.StringWriter;
import java.io.IOException;

public class StringWriter_1 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        
        try {
            writer.write('A');
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
