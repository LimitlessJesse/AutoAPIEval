import java.security.AlgorithmParameterGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AlgorithmParameterGenerator_1 {
    public static void main(String[] args) {
        try {
            // Initialize AlgorithmParameterGenerator with specified strength
            AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("DiffieHellman");
            int strength = 1024; // strength parameter
            paramGen.init(strength);

            // Generate parameters
            paramGen.generateParameters();
            System.out.println("AlgorithmParameterGenerator initialized successfully with strength: " + strength);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
