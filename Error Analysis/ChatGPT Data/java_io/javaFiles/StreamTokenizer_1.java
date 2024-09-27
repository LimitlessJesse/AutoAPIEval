import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.IOException;

public class StreamTokenizer_1 {
    public static void main(String[] args) {
        String str = "10 20 30";
        StringReader sr = new StringReader(str);
        StreamTokenizer tokenizer = new StreamTokenizer(sr);
        
        try {
            int token;
            while ((token = tokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
                if (token == StreamTokenizer.TT_NUMBER) {
                    int num = (int) tokenizer.nval;
                    System.out.println("Number: " + num);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
