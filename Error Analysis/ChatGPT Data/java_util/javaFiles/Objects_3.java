import java.util.Objects;

public class Objects_3 {
    public static void main(String[] args) {
        Object obj1 = null;
        Object obj2 = new Object();

        System.out.println("obj1 is null: " + Objects.isNull(obj1));
        System.out.println("obj2 is null: " + Objects.isNull(obj2));
    }
}
