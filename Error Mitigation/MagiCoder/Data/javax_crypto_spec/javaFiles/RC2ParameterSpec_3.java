import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_3 {
    public static void main(String[] args) {
        // Create a new RC2ParameterSpec object
        RC2ParameterSpec spec = new RC2ParameterSpec(128, 10);

        // Get the IV
        byte[] iv = spec.getIV();

        // Print the IV
        if (iv!= null) {
            for (byte b : iv) {
                System.out.print(b + " ");
            }
        } else {
            System.out.println("IV is null");
        }
    }
}
