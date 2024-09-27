import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriter_5 {
    public static void main(String[] args) {
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
