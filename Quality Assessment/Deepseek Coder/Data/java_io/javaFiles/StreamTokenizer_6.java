import java.io.*;

public class StreamTokenizer_6 {
    public static void main(String[] args) throws IOException {
        String input = "Hello, World!";
        StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(input));
        
        // Set the range of whitespace characters to be tokenized
        tokenizer.whitespaceChars(32, 32);
        
        // Tokenize the input
        while (tokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
            if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                System.out.println(tokenizer.sval);
            }
        }
    }
}
