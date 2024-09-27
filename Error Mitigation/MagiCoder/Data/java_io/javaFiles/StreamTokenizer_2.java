import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenizer_2 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello World!");
        StreamTokenizer streamTokenizer = new StreamTokenizer(stringReader);

        try {
            int token = streamTokenizer.nextToken();
            while (token!= StreamTokenizer.TT_EOF) {
                switch (token) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word: " + streamTokenizer.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Number: " + streamTokenizer.nval);
                        break;
                    case'':
                        System.out.println("Space");
                        break;
                    default:
                        System.out.println("Special character: " + (char) token);
                }
                token = streamTokenizer.nextToken();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
