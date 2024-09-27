import java.util.StringTokenizer;

public class StringTokenizer_2 {
    public static void main(String[] args) {
        String str = "Hello, World, Java";
        StringTokenizer st = new StringTokenizer(str, ",");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
