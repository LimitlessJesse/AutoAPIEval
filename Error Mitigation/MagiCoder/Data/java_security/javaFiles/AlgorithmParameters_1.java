import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;

public class AlgorithmParameters_1 {
    public static void main(String[] args) {
        try {
            AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
            // Further initialization or usage of params can be added here
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
