import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_4 {
    public static void main(String[] args) {
        PBEKeySpec keySpec = new PBEKeySpec("password".toCharArray());
        int keyLength = keySpec.getKeyLength();
        System.out.println("Key Length: " + keyLength);
    }
}
