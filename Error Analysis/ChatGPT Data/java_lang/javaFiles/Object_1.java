import java.util.Objects;

public class Object_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using equals() method to compare two strings
        boolean result1 = str1.equals(str2);
        System.out.println("Result 1: " + result1); // Output: false

        // Using equals() method to compare two strings
        boolean result2 = Objects.equals(str1, str2);
        System.out.println("Result 2: " + result2); // Output: false
    }
}
