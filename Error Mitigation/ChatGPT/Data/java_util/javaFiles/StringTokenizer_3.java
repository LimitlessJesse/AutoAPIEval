import java.util.StringTokenizer;

public class StringTokenizer_3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("This is a sample sentence");
        int tokensRemaining = st.countTokens();
        System.out.println("Number of tokens remaining: " + tokensRemaining);
    }
}
