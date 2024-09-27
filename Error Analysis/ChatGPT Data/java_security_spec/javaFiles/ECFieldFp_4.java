import java.security.spec.ECFieldFp;

public class ECFieldFp_4 {
    public static void main(String[] args) {
        ECFieldFp ecField = new ECFieldFp(10);
        ECFieldFp ecField2 = new ECFieldFp(10);

        boolean isEqual = ecField.equals(ecField2);
        System.out.println("Are the ECFieldFp objects equal? " + isEqual);
    }
}
