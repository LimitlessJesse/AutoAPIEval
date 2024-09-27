import java.lang.String;

public class String_5 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        
        boolean result1 = str1.equals(str2);
        System.out.println(result1); // Output: true
        
        String str3 = "World";
        
        boolean result2 = str1.equals(str3);
        System.out.println(result2); // Output: false
    }
}
