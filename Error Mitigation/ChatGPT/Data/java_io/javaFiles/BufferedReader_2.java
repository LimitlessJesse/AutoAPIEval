import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class BufferedReader_2 {
    public static void main(String[] args) {
        String text = "Hello World!";
        BufferedReader reader = new BufferedReader(new StringReader(text));
        
        try {
            int charRead = reader.read();
            System.out.println((char) charRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
