import java.util.StringTokenizer;

public class StringTokenizer_4 {
    public static void main(String[] args) {
        String str = "Hello, World! This is a test.";
        StringTokenizer tokenizer = new StringTokenizer(str, " ,!");
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
