public class String_5 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        // Comparing str1 and str2
        boolean result1 = str1.equals(str2);
        System.out.println("str1 equals str2: " + result1);

        // Comparing str1 and str3
        boolean result2 = str1.equals(str3);
        System.out.println("str1 equals str3: " + result2);
    }
}
