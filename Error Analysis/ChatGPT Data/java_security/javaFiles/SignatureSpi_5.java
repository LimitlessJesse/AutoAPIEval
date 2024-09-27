import java.security.SignatureSpi;

public class SignatureSpi_5 {
    public static void main(String[] args) {
        // Sample code to use engineSign method
        byte[] dataToSign = "Hello, World!".getBytes();
        SignatureSpi signature = new CustomSignatureSpi(); // CustomSignatureSpi extends SignatureSpi
        signature.engineInitSign(null);
        signature.engineUpdate(dataToSign, 0, dataToSign.length);
        byte[] signatureBytes = signature.engineSign();
        System.out.println("Signature: " + new String(signatureBytes));
    }
}
