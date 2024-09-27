import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class BufferedReader_5 {
    public static void main(String[] args) {
        String text = "Hello World!";
        BufferedReader reader = new BufferedReader(new StringReader(text));
        
        try {
            reader.close();
            System.out.println("Stream closed successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while closing the stream: " + e.getMessage());
        }
    }
}
