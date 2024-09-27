import java.security.spec.ECFieldFp;

public class ECFieldFp_2 {
    public static void main(String[] args) {
        ECFieldFp ecField = new ECFieldFp(11); // Create an instance of ECFieldFp with prime p = 11
        int fieldSize = ecField.getFieldSize(); // Get the field size in bits
        System.out.println("Field size: " + fieldSize);
    }
}
