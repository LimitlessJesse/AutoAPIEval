import java.security.spec.DSAGenParameterSpec;

public class DSAGenParameterSpec_4 {
    public static void main(String[] args) {
        DSAGenParameterSpec spec = new DSAGenParameterSpec(1024, 160, 64);
        int seedLength = spec.getSeedLength();
        System.out.println("Seed Length: " + seedLength);
    }
}
