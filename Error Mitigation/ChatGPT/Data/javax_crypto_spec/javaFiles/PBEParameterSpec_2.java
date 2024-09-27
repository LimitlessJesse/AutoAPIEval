import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_2 {
    public static void main(String[] args) {
        byte[] salt = new byte[8]; // Example salt array
        PBEParameterSpec pbeParamSpec = new PBEParameterSpec(salt, 1000); // Creating PBEParameterSpec object
        byte[] retrievedSalt = pbeParamSpec.getSalt(); // Getting the salt
        System.out.println("Retrieved salt: " + new String(retrievedSalt));
    }
}
