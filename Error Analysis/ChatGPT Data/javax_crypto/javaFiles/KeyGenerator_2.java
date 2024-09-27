import javax.crypto.KeyGenerator;

public class KeyGenerator_2 {
    public static void main(String[] args) {
        int keysize = 128;
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(keysize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
