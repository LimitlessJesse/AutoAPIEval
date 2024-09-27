import javax.crypto.Cipher;

public class Cipher_4 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] aad = "Additional Authentication Data".getBytes();
            cipher.updateAAD(aad);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
