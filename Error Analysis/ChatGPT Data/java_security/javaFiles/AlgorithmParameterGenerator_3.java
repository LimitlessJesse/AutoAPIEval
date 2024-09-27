import java.security.AlgorithmParameterGenerator;
import java.security.SecureRandom;

public class AlgorithmParameterGenerator_3 {
    public static void main(String[] args) {
        int strength = 512;
        SecureRandom random = new SecureRandom();
        
        AlgorithmParameterGenerator paramGen;
        try {
            paramGen = AlgorithmParameterGenerator.getInstance("DiffieHellman");
            paramGen.init(strength, random);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
