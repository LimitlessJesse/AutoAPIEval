import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_1 {
    public static void main(String[] args) {
        int keyLength = getKeyLength();
        System.out.println("Key length: " + keyLength);
    }
    
    public static int getKeyLength() {
        PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());
        return pbeKeySpec.getKeyLength();
    }
}
