import java.util.StringTokenizer;

public class StringTokenizer_1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello World");
        int count = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }
        System.out.println("Number of tokens: " + count);
    }
}
