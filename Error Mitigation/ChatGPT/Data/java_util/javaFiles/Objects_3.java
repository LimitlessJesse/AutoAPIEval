import java.util.Objects;

public class Objects_3 {
    public static void main(String[] args) {
        Object obj = null;
        boolean result = Objects.isNull(obj);
        System.out.println("Is object null? " + result);
    }
}
