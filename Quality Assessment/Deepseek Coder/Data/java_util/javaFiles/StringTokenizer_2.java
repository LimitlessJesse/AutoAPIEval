import java.util.StringTokenizer;

public class StringTokenizer_2 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello World");
        
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
