import java.security.spec.ECFieldFp;

public class ECFieldFp_2 {
    public static void main(String[] args) {
        ECFieldFp field = new ECFieldFp(7); // Create an ECFieldFp object with prime value 7
        System.out.println("Field size: " + field.getFieldSize()); // Output the field size
    }
}
