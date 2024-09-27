import java.security.spec.DSAGenParameterSpec;

public class DSAGenParameterSpec_1 {
    public static void main(String[] args) {
        DSAGenParameterSpec spec = new DSAGenParameterSpec(1024, 160);
        int primePLength = spec.getPrimePLength();
        System.out.println("Length of the prime P: " + primePLength);
    }
}
