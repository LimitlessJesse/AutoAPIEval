import javax.crypto.EncryptedPrivateKeyInfo;

public class EncryptedPrivateKeyInfo_2 {
    public static void main(String[] args) {
        EncryptedPrivateKeyInfo info = new EncryptedPrivateKeyInfo();
        String algName = info.getAlgName();
        System.out.println("Algorithm name: " + algName);
    }
}
