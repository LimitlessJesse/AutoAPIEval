import java.util.StringTokenizer;

public class StringTokenizer_4 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        int tokensCount = tokenizer.countTokens();
        System.out.println("Number of tokens: " + tokensCount);
    }
}
