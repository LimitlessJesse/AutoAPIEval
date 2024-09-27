import java.io.*;

public class StreamTokenizer_1 {
    public static void main(String[] args) throws IOException {
        String input = "Hello, World!";
        StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(input));

        while (tokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
            if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                System.out.println(tokenizer.sval);
            } else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                System.out.println(tokenizer.nval);
            } else {
                System.out.println((char) tokenizer.ttype);
            }
        }
    }
}
