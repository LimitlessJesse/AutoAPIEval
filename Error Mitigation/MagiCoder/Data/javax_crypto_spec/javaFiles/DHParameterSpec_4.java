import javax.crypto.spec.DHParameterSpec;

public class DHParameterSpec_4 {
    public static void main(String[] args) {
        DHParameterSpec dhParameterSpec = new DHParameterSpec(1024, 2);
        int l = dhParameterSpec.getL();
        System.out.println("The size in bits, l, of the random exponent is: " + l);
    }
}
