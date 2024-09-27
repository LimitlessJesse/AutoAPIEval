import java.lang.Boolean;

public class Boolean_2 {
    public static void main(String[] args) {
        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.TRUE;
        Boolean b3 = Boolean.FALSE;

        System.out.println(b1.equals(b2));  // Output: true
        System.out.println(b1.equals(b3));  // Output: false
    }
}
