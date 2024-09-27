import java.security.spec.ECFieldFp;

public class ECFieldFp_5 {
    public static void main(String[] args) {
        ECFieldFp ecFieldFp = new ECFieldFp(10); // Create an instance of ECFieldFp with prime number 10
        int hashCode = ecFieldFp.hashCode(); // Get the hash code of the ECFieldFp instance
        System.out.println("Hash code: " + hashCode);
    }
}
