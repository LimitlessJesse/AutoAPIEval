import java.util.Objects;

public class Objects_2 {
    public static void main(String[] args) {
        String str = "Hello";
        int hashCode = Objects.hashCode(str);
        System.out.println("Hash code of '" + str + "' is: " + hashCode);
    }
}
