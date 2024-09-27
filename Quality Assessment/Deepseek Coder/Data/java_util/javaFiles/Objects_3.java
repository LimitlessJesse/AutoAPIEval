import java.util.Objects;

public class Objects_3 {
    public static void main(String[] args) {
        String str = null;
        boolean isNull = Objects.isNull(str);
        System.out.println("Is the object null? " + isNull);
    }
}
