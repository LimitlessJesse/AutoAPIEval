import javax.crypto.spec.PSource;

public class PSource_1 {
    public static void main(String[] args) {
        PSource pSource = PSource.PSpecified.DEFAULT;
        String algorithm = pSource.getAlgorithm();
        System.out.println("Algorithm: " + algorithm);
    }
}
