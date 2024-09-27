public class String_6 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "HELLO";
        String str3 = "World";

        boolean result1 = str1.equalsIgnoreCase(str2);
        boolean result2 = str1.equalsIgnoreCase(str3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
