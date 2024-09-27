import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;

public class AlgorithmParameters_3 {
    public static void main(String[] args) {
        try {
            Provider provider = Security.getProvider("SunJCE");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES", provider);
            // Further initialization or usage of parameters can be added here
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
