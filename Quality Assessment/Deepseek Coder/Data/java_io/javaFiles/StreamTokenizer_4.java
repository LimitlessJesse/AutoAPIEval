import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenizer_4 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(input));
        
        // Set the characters ',' and '!' as word characters
        tokenizer.wordChars(',', ',');
        tokenizer.wordChars(' ','');
        tokenizer.wordChars('1', '9');

        try {
            // Print the tokens
            while (tokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println(tokenizer.sval);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
