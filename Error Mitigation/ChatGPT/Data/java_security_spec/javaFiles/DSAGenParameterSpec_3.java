import java.security.spec.DSAGenParameterSpec;

public class DSAGenParameterSpec_3 {
    public static void main(String[] args) {
        DSAGenParameterSpec spec = new DSAGenParameterSpec(1024, 160);
        int subprimeQLength = spec.getSubprimeQLength();
        System.out.println("Subprime Q Length: " + subprimeQLength);
    }
}
