import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class AlgorithmParameters_2 {
    public static void main(String[] args) {
        try {
            AlgorithmParameters params = AlgorithmParameters.getInstance("AES", "SunJCE");
            // Further initialization or usage of params goes here
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
        }
    }
}
