import javax.crypto.CipherOutputStream;

public class CipherOutputStream_3 {
    public static void main(String[] args) {
        CipherOutputStream cipherOutputStream = new CipherOutputStream(System.out);
        try {
            cipherOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
