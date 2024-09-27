import javax.crypto.KeyAgreement;

public class KeyAgreement_4 {
    public static void main(String[] args) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
            String algorithm = keyAgreement.getAlgorithm();
            System.out.println("Algorithm name: " + algorithm);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
