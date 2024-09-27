import javax.crypto.EncryptedPrivateKeyInfo;

public class EncryptedPrivateKeyInfo_1 {
    public static void main(String[] args) {
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo();
        byte[] encryptedData = encryptedPrivateKeyInfo.getEncryptedData();
        System.out.println("Encrypted Data: " + encryptedData);
    }
}
