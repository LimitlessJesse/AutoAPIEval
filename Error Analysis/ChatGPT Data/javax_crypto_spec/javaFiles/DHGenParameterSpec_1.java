import javax.crypto.spec.DHGenParameterSpec;

public class DHGenParameterSpec_1 {
    public static void main(String[] args) {
        DHGenParameterSpec spec = new DHGenParameterSpec(1024, 160);
        int primeSize = spec.getPrimeSize();
        System.out.println("Prime size: " + primeSize);
    }
}
