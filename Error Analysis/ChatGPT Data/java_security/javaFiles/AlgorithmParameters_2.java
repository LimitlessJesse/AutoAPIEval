import java.security.AlgorithmParameters;
import java.security.spec.AlgorithmParameterSpec;
import java.security.NoSuchAlgorithmException;

public class AlgorithmParameters_2 {
    public static void main(String[] args) {
        AlgorithmParameters algorithmParameters;
        AlgorithmParameterSpec paramSpec;

        // Initialize AlgorithmParameters using init method
        try {
            algorithmParameters = AlgorithmParameters.getInstance("AES");
            algorithmParameters.init(paramSpec);
            System.out.println("AlgorithmParameters initialized successfully");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
