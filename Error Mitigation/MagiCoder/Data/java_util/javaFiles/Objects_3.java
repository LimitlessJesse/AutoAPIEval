import java.util.Objects;

public class Objects_3 {
    public static void main(String[] args) {
        Object obj = null;
        System.out.println(Objects.isNull(obj)); // Outputs: true

        obj = "Hello";
        System.out.println(Objects.isNull(obj)); // Outputs: false
    }
}
