import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_1 {
    public static void main(String[] args) {
        char[] password = "myPassword".toCharArray();
        
        PBEKeySpec keySpec = new PBEKeySpec(password);
        char[] retrievedPassword = keySpec.getPassword();
        
        System.out.println(retrievedPassword);
    }
}
