import java.util.Arrays;

public class Arrays_3 {
    public static void main(String[] args) {
        Object[] array = {"Hello", "World"};
        int hashCode = Arrays.hashCode(array);
        System.out.println("Hash code: " + hashCode);
    }
}
