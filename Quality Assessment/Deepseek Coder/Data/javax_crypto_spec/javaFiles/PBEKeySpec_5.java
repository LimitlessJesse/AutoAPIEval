import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_5 {
    public static void main(String[] args) {
        // Create a PBEKeySpec object
        PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());
        
        // Get the key length
        int keyLength = pbeKeySpec.getKeyLength();
        
        // Print the key length
        System.out.println("Key length: " + keyLength);
    }
}
