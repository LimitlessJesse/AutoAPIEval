import java.lang.StringBuilder;

public class StringBuilder_4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(2, "World");
        System.out.println(sb);
    }
}
