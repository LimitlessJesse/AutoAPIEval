import java.lang.Boolean;

public class Boolean_3 {
    public static void main(String[] args) {
        Boolean bool1 = true;
        Boolean bool2 = false;

        int hashCode1 = bool1.hashCode();
        int hashCode2 = bool2.hashCode();

        System.out.println("Hash code for true: " + hashCode1);
        System.out.println("Hash code for false: " + hashCode2);
    }
}
