import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.IOException;

public class StreamTokenizer_4 {
    public static void main(String[] args) {
        String input = "Hello World\nThis is a test";
        StringReader reader = new StringReader(input);
        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        
        // Setting end of line as significant
        tokenizer.eolIsSignificant(true);
        
        try {
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                switch (tokenizer.ttype) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word: " + tokenizer.sval);
                        break;
                    case StreamTokenizer.TT_EOL:
                        System.out.println("End of Line");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
