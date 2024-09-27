import java.lang.Boolean;

public class Boolean_2 {
    public static void main(String[] args) {
        Boolean bool1 = true;
        Boolean bool2 = false;

        int result1 = bool1.compareTo(bool2);
        int result2 = bool2.compareTo(bool1);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
