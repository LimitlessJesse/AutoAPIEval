import java.security.spec.ECFieldFp;

public class ECFieldFp_4 {
    public static void main(String[] args) {
        ECFieldFp ecField = new ECFieldFp(10); // Example value for the prime modulus
        int hashCode = ecField.hashCode();
        System.out.println("Hash code for prime finite field: " + hashCode);
    }
}
