import java.lang.StringBuilder;

public class StringBuilder_6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before reverse: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
