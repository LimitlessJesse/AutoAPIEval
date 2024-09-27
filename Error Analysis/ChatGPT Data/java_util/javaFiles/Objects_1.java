import java.util.Objects;

public class Objects_1 {
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = "Hello";
        
        boolean result = Objects.deepEquals(obj1, obj2);
        System.out.println("Are objects equal? " + result);
    }
}
