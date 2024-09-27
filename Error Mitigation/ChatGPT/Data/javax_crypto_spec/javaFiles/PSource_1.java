import javax.crypto.spec.PSource;

public class PSource_1 {
    public static void main(String[] args) {
        PSource pSource = new PSource();
        String algorithm = pSource.getAlgorithm();
        System.out.println("PSource algorithm name: " + algorithm);
    }
}
