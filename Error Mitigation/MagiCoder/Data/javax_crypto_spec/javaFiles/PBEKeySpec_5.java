import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_5 {
    public static void main(String[] args) {
        PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());
        int keyLength = pbeKeySpec.getKeyLength();
        System.out.println("Key length: " + keyLength);
    }
}
