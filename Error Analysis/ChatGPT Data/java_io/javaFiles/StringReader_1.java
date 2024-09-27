import java.io.StringReader;
import java.io.IOException;

public class StringReader_1 {
    public static void main(String[] args) {
        String input = "12345";
        StringReader reader = new StringReader(input);
        try {
            int data = reader.read();
            while(data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
