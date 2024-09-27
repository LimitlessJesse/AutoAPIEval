import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class StringTokenizer_4 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello World");
        try {
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        } catch (NoSuchElementException e) {
            System.out.println("No more tokens");
        }
    }
}
