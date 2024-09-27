import java.util.Objects;

public class Objects_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        boolean isEqual = Objects.equals(str1, str2);
        System.out.println("str1 and str2 are equal: " + isEqual);

        isEqual = Objects.equals(str1, str3);
        System.out.println("str1 and str3 are equal: " + isEqual);
    }
}
