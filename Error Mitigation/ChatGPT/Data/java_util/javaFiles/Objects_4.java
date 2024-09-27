import java.util.Objects;

public class Objects_4 {
    public static void main(String[] args) {
        Object obj = "Hello";
        System.out.println(Objects.toString(obj));
        
        Object nullObj = null;
        System.out.println(Objects.toString(nullObj));
    }
}
