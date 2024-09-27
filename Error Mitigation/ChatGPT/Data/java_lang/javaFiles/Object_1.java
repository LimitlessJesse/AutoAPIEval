import java.util.Objects;

public class Object_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        
        boolean result1 = str1.equals(str2);
        System.out.println("Result 1: " + result1); // Output: true
        
        String str3 = new String("Hello");
        
        boolean result2 = str1.equals(str3);
        System.out.println("Result 2: " + result2); // Output: true
    }
}
