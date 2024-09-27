import java.lang.StringBuilder;

public class StringBuilder_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before insert: " + sb);

        sb.insert(2, "Java");
        System.out.println("After insert: " + sb);
    }
}
