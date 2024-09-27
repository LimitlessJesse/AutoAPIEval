import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;

public class ECPublicKeySpec_2 {
    public static void main(String[] args) {
        // Create an instance of ECPublicKeySpec
        ECPublicKeySpec ecPublicKeySpec = new ECPublicKeySpec(null, null);
        
        // Get the EC domain parameters using getParams() method
        ECParameterSpec ecParams = ecPublicKeySpec.getParams();
        
        // Print the EC domain parameters
        System.out.println("EC Domain Parameters: " + ecParams);
    }
}
