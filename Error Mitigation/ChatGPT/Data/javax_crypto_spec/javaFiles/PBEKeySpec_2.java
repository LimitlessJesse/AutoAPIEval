import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_2 {
    public static void main(String[] args) {
        char[] password = "password123".toCharArray();
        byte[] salt = new byte[]{0, 1, 2, 3, 4};
        
        PBEKeySpec pbeKeySpec = new PBEKeySpec(password, salt, 1000, 256);
        
        byte[] retrievedSalt = pbeKeySpec.getSalt();
        
        System.out.println("Retrieved salt: " + new String(retrievedSalt));
    }
}
