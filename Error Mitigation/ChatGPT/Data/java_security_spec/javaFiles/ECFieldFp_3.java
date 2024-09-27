import java.security.spec.ECFieldFp;

public class ECFieldFp_3 {
    public static void main(String[] args) {
        ECFieldFp field1 = new ECFieldFp(7);
        ECFieldFp field2 = new ECFieldFp(7);
        
        boolean result1 = field1.equals(field2);
        System.out.println("Result 1: " + result1); // Output: true
        
        ECFieldFp field3 = new ECFieldFp(11);
        
        boolean result2 = field1.equals(field3);
        System.out.println("Result 2: " + result2); // Output: false
    }
}
