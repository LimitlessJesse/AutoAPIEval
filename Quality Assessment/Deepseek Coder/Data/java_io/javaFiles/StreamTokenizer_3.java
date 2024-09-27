import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.IOException;

public class StreamTokenizer_3 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        StringReader reader = new StringReader(input);
        StreamTokenizer tokenizer = new StreamTokenizer(reader);

        try {
            while (tokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println(tokenizer.sval);
                }
            }

            // Reset the tokenizer
            tokenizer.resetSyntax();

            // Set a new input
            tokenizer.reset(new StringReader("New input"));

            // Read the new input
            while (tokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println(tokenizer.sval);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
