import java.io.StringReader;
import java.io.StreamTokenizer;
import java.io.IOException;

public class StreamTokenizer_1 {
    public static void main(String[] args) {
        String input = "Hello World 123";
        StringReader reader = new StringReader(input);
        StreamTokenizer tokenizer = new StreamTokenizer(reader);

        try {
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println("Word: " + tokenizer.sval);
                } else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println("Number: " + tokenizer.nval);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
