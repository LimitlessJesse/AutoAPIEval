import java.util.Arrays;

public class String_20 {
    public static void main(String[] args) {
        String str = "boo:and:foo";
        String[] result = str.split(":");
        System.out.println(Arrays.toString(result));
    }
}
