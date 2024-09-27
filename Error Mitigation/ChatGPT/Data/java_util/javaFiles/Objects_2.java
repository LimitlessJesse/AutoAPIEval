import java.util.Objects;

public class Objects_2 {
    public static void main(String[] args) {
        Object obj = new Object();
        int hashCode = Objects.hashCode(obj);
        System.out.println("Hash code: " + hashCode);
    }
}
