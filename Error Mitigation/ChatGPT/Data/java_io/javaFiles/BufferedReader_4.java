import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class BufferedReader_4 {
    public static void main(String[] args) {
        String text = "Hello World";
        BufferedReader reader = new BufferedReader(new StringReader(text));
        
        try {
            boolean isReady = reader.ready();
            System.out.println("Is the stream ready to be read? " + isReady);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
