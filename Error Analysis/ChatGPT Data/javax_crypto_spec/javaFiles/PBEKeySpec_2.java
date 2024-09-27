import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_2 {
    public static void main(String[] args) {
        char[] password = "secret".toCharArray();
        
        PBEKeySpec keySpec = new PBEKeySpec(password);
        
        // Use getPassword() method to retrieve the password
        char[] retrievedPassword = keySpec.getPassword();
        
        // Print out the retrieved password
        System.out.println("Retrieved password: " + new String(retrievedPassword));
    }
}
