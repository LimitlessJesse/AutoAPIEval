import java.util.Objects;

public class Objects_5 {
    public static void main(String[] args) {
        String str = "Hello";
        String result = Objects.requireNonNull(str);
        System.out.println(result);
    }
}
