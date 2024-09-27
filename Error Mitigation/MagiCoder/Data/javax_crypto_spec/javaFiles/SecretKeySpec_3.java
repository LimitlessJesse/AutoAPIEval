import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_3 {
    public static void main(String[] args) {
        // Create a new SecretKeySpec object
        SecretKeySpec secretKeySpec = new SecretKeySpec("mySecretKey".getBytes(), "AES");

        // Get the algorithm associated with the secret key
        String algorithm = secretKeySpec.getAlgorithm();

        // Print the algorithm
        System.out.println("Algorithm: " + algorithm);
    }
}
