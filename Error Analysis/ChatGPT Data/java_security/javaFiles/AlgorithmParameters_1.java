import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;

public class AlgorithmParameters_1 {
    public static void main(String[] args) {
        try {
            AlgorithmParameters algorithmParams = AlgorithmParameters.getInstance("AES");
            System.out.println(algorithmParams.getAlgorithm());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Algorithm not found: " + e.getMessage());
        }
    }
}
