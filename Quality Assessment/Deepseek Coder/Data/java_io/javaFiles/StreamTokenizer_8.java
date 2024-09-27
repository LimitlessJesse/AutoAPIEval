import java.io.*;

public class StreamTokenizer_8 {
    public static void main(String[] args) throws IOException {
        String input = "Hello, World!";
        StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(input));

        // Read the first token
        int token = tokenizer.nextToken();

        // Check if the first token is a word
        if (token == StreamTokenizer.TT_WORD) {
            System.out.println("First token: " + tokenizer.sval);
        }

        // Push the comma back into the input stream
        tokenizer.pushBack();

        // Read the next token
        token = tokenizer.nextToken();

        // Check if the next token is a word
        if (token == StreamTokenizer.TT_WORD) {
            System.out.println("Next token: " + tokenizer.sval);
        }
    }
}
