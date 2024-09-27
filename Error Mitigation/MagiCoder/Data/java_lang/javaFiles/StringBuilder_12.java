import java.lang.StringBuilder;

public class StringBuilder_12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println(sb);
    }
}
