import java.lang.StringBuilder;

public class StringBuilder_5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(6, 11); // Removes "World"
        System.out.println(sb);
    }
}
