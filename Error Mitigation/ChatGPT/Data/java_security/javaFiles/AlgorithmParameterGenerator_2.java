import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;

public class AlgorithmParameterGenerator_2 {
    public static void main(String[] args) {
        try {
            AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("DSA");
            paramGen.init(1024);
            AlgorithmParameters params = paramGen.generateParameters();
            System.out.println("Generated parameters: " + params);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
