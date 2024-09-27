import javax.net.ssl.KeyManagerFactory;

public class KeyManagerFactory_3 {
    public static void main(String[] args) {
        try {
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            System.out.println(kmf.getAlgorithm()); // This will print the algorithm name used by the KeyManagerFactory instance
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
