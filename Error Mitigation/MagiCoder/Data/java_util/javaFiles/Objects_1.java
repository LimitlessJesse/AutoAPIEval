import java.util.Objects;

public class Objects_1 {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = a;

        System.out.println(Objects.equals(a, b)); // false
        System.out.println(Objects.equals(a, c)); // true
        System.out.println(Objects.equals(a, null)); // false
        System.out.println(Objects.equals(null, a)); // false
        System.out.println(Objects.equals(null, null)); // true
    }
}
