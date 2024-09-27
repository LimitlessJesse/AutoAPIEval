import java.security.AlgorithmParameterGenerator;
import java.security.NoSuchAlgorithmException;

public class AlgorithmParameterGenerator_1 {
    public static void main(String[] args) {
        try {
            AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("AES");
            paramGen.init(128);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
