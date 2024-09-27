import java.lang.StringBuilder;

public class StringBuilder_11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.deleteCharAt(5); // removes the space
        System.out.println(sb);
    }
}
