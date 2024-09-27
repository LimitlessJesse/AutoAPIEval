import java.util.StringTokenizer;

public class StringTokenizer_1 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringTokenizer tokenizer = new StringTokenizer(str);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
