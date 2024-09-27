import java.util.StringTokenizer;

public class StringTokenizer_2 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringTokenizer tokenizer = new StringTokenizer(str);
        
        boolean hasMoreTokens = tokenizer.hasMoreTokens();
        System.out.println("Has more tokens: " + hasMoreTokens);
    }
}
