import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.IOException;

public class StreamTokenizer_4 {
    public static void main(String[] args) {
        String text = "Hello World\nThis is a test";
        
        try {
            StringReader reader = new StringReader(text);
            StreamTokenizer tokenizer = new StreamTokenizer(reader);
            tokenizer.eolIsSignificant(true);
            
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                System.out.println("Token: " + tokenizer.sval);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
