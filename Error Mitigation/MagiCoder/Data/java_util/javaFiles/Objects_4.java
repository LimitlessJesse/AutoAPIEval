import java.util.Objects;

public class Objects_4 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = null;

        System.out.println(Objects.nonNull(obj1)); // Output: true
        System.out.println(Objects.nonNull(obj2)); // Output: false
    }
}
