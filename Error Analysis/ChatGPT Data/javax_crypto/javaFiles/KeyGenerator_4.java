import javax.crypto.KeyGenerator;

public class KeyGenerator_4 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            System.out.println("Algorithm: " + keyGen.getAlgorithm());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
