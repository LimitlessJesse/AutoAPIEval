import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.CipherSpi;

public class CipherSpi_1 {
    public static void main(String[] args) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            CipherSpi cipherSpi = cipher.getProvider().getCipher(cipher.getAlgorithm());
            int blockSize = cipherSpi.engineGetBlockSize();
            System.out.println("Block size: " + blockSize);
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }
}
