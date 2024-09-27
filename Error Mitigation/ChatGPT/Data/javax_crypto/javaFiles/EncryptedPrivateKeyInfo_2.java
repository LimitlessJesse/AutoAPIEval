import javax.crypto.EncryptedPrivateKeyInfo;

public class EncryptedPrivateKeyInfo_2 {
    public static void main(String[] args) {
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo();
        String algorithmName = encryptedPrivateKeyInfo.getAlgName();
        System.out.println("Encryption Algorithm Name: " + algorithmName);
    }
}
