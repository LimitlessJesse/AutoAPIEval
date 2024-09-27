import java.util.StringTokenizer;

public class StringTokenizer_1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("This is a test sentence");
        
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
