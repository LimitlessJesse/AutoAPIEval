import javax.crypto.EncryptedPrivateKeyInfo;

public class EncryptedPrivateKeyInfo_1 {
    public static void main(String[] args) {
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(byte[] encryptedData);
        byte[] data = encryptedPrivateKeyInfo.getEncryptedData();
    }
}
