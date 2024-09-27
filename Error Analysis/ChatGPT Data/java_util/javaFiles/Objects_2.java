import java.util.Objects;

public class Objects_2 {
    public static void main(String[] args) {
        String str = "Hello";
        int hash = Objects.hashCode(str);
        System.out.println("Hash code for \"" + str + "\": " + hash);
    }
}
