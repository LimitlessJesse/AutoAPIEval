import java.io.IOException;
import java.io.StringWriter;

public class Writer_4 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        
        try {
            writer.write(65); // writing character 'A'
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
